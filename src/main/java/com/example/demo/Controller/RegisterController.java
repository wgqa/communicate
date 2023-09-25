package com.example.demo.Controller;

import com.example.demo.domain.T;
import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaml.snakeyaml.constructor.BaseConstructor;

@Controller
@RequestMapping("/register")
public class RegisterController extends BaseConstructor {
    @GetMapping("/Register")
    @ResponseBody
    public T<Boolean> Register(@RequestBody User user){



    }
}
