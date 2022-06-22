package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Picture;
import com.example.demo.repository.PictureRepo;

import java.util.Base64;

@Controller
public class ImageController {

    @Autowired
    PictureRepo pictureRepo;

    @RequestMapping(value = "image", method = RequestMethod.GET)
    public String showImage(@RequestParam("id") int id, Model model) {
        Picture pic = pictureRepo.findById(id).get();
        String photoencodeBase64 = Base64.getEncoder().encodeToString(pic.getData());
        model.addAttribute("accPicture", photoencodeBase64);
        return "pic.html";
    }



}
