package com.example.demo.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
public class BasicController {

    @GetMapping("/check")
    @ResponseBody
    public String test(){
        return "hi";
    }
}
