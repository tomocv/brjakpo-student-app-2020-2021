package com.tomocv.brjakpo.brjakpostudentapp20202021.controller;

import com.tomocv.brjakpo.brjakpostudentapp20202021.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello-world")
public class HelloWorld {

    @GetMapping
    public String helloWorld(Model model) {
        model.addAttribute("student", new Student());
        return "hello-world";
    }

    @PostMapping
    public String helloWorldProcessed(Student student) {
        return "hello-world-processed";
    }
}
