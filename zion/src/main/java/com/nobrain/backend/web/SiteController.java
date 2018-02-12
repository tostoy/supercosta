package com.nobrain.backend.web;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SiteController {
    @RequestMapping("/")
    String home() {

        return "Hello Worl7yyy7ll7d9999!";
    }

}
