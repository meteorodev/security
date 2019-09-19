package com.drv.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainCrtl {

       @GetMapping("/")
       public String index(){
              return "Autorization server";
       }

       @RequestMapping("hello")
       public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
              return "Hello "+name+"!!";
       }
}
