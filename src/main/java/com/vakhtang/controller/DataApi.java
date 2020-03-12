package com.vakhtang.controller;

import com.vakhtang.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataApi {

    @Autowired
    DataService service;

    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return service.getData();
    }

}
