package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world/{a}")
    @ResponseBody
    public String hello(@PathVariable("a") String a) {
        a = "hello " + a;
        return a;
    }
}
