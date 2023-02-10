package com.rahul.controller;

import com.rahul.model.Welcome;
import com.rahul.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public List<String> demo(){
        return demoService.get();
    };
    @PostMapping("/set")
    public String set(@RequestParam String message){
        return demoService.save(message);
    }
}
