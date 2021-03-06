package com.penguin.learn.springboot.controller;

import com.penguin.learn.springboot.pojo.FileInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping("/file")
public class FileController {

    private String path = "C:\\Users\\pengu\\Pictures";

    @PostMapping
    public FileInfo upload(@RequestParam("pic") MultipartFile file) throws Exception{
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());

        File localFile = new File(path, file.getOriginalFilename());

        file.transferTo(localFile);

        return new FileInfo(localFile.getAbsolutePath());
    }

    @GetMapping("/{id}")
    public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response){
        try(InputStream inputStream = new FileInputStream(new File(path, id + ".jpg"));
            OutputStream outputStream = response.getOutputStream()){
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=" + id + ".jpg");
            IOUtils.copy(inputStream, outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
