package com.example.test1.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ResourceController {


    @RequestMapping(value = "/**")
    @ResponseBody
    public String initCount(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "hello word!";
    }
}