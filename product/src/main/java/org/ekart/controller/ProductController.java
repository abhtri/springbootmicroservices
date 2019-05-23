package org.ekart.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping(value="/getproduct",produces = MediaType.APPLICATION_JSON_VALUE)
    public List getProduct(){
        return Collections.emptyList();
    }

}
