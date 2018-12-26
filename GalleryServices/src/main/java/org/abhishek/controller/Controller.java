package org.abhishek.controller;

import org.abhishek.bean.Gallery;
import org.abhishek.bean.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController()
public class Controller {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public Gallery getGallery(@PathVariable int id){
        Gallery gallery = new Gallery();
        gallery.setId(id);
        List<Images> images = restTemplate.getForObject("http://image-service/images/", List.class);
        gallery.setImages(images);

        return gallery;

    }
}
