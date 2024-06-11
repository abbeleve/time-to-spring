package org.example.controllers;

import org.example.group.Roles;
import org.example.group.Student;
import org.example.jsons.newcomer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public List<Student> registerUser(@RequestParam Integer age, @RequestParam String name, @RequestParam String surname) {
        Student student = new Student(Roles.Noob, name, surname, age);
        List<Student> guys = new ArrayList<>();
        guys.add(student);
        return guys;
    }

    @GetMapping("/gettest")
    public List<newcomer> getTest() {
        newcomer newguy = new newcomer(19, "Ruslan", "Smirnagin");
        List<newcomer> res = new ArrayList<>();
        res.add(newguy);
        return res;
    }
}

@Controller
class RedirectingController {

    @GetMapping("/redirectWithRedirectPrefix")
    public ModelAndView redirectTest(ModelMap model) {
        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/redirectedUrl", model);
    }

    @GetMapping("/redirectedUrl")
    public String redirected() {
        return "gettest";
    }
}