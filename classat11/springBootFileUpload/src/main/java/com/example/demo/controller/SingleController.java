package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Picture;
import com.example.demo.repository.PictureRepo;

import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SingleController {

    @Autowired
    PictureRepo pictureRepo;

    @RequestMapping("sindex")
    public String sindex(){
        return "sindex.html";
    }

    @RequestMapping("singleFileUp")
    @ResponseBody
    public String singleFileUp(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Picture picture = new Picture(fileName, file.getContentType(), file.getBytes());
        pictureRepo.save(picture);
        return "Success";
    }


    @RequestMapping("/download")
    public ResponseEntity<Resource> downloadFile(@RequestParam("id") int id, ModelMap modelMap) {
        // Load file from database
        Picture picture = pictureRepo.findById(id).get();


        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(picture.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + picture.getFileName() + "\"")
                .body(new ByteArrayResource(picture.getData()));
        
    }
}
