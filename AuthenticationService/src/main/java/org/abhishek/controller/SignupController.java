package org.abhishek.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @PostMapping("/auth/signUP")
    public String signup(){
        return "signu p ";
    }

    @PostMapping("/auth/login")
    public String suth(){
        return "signu p ";
    }
}
