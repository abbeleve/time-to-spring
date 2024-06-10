package org.example.controllers;

import org.example.group.Roles;
import org.example.group.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @PostMapping("/register")
    public String registerUser(@RequestParam Integer age, @RequestParam String name, @RequestParam String surname, Model model) {
        Student student = new Student(Roles.Noob, name, surname, age);

        model.addAttribute("user", student);
        return "registration-success";
    }

    @GetMapping("/gettest")
    public String getTest() {
        return "gettest";
    }
}
