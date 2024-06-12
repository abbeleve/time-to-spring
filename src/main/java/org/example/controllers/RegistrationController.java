package org.example.controllers;

import jakarta.validation.Valid;
import org.example.group.Roles;
import org.example.group.Student;
import org.example.jsons.newcomer;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Binding;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public List<Student> registerUser(@RequestParam Integer age, @RequestParam String name, @RequestParam String surname) {
        Student student = new Student(Roles.Noob, name, surname, age, "hoollow", "asd");
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

    @GetMapping("/registration")
    public String registreation(Model model) {
        model.addAttribute("uesrForm", new Student());

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") @Valid Student userForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())){
            model.addAttribute("passwordError", "Пароли не совпадают");
            return "registration";
        }
        if (!userService.saveUser(userForm)){
            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
            return "registration";
        }

        return "redirect:/";
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