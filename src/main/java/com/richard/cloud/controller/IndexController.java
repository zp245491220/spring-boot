package com.richard.cloud.controller;

import com.richard.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
   private  UserService userService;

    @RequestMapping("/")
    public String  index(){
        List list = userService.getList();
        return "index";
    }

}
