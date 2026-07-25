package com.thymeleaf.controller;

import com.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World from Model");
        return "hello_world";
    }

    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        User user = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    @GetMapping("/fragment-expression")
    public String fragmentExpression(Model model) {
        model.addAttribute("id", 1);
        return "fragment-expression";
    }


    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = Arrays.asList(
                new User("admin", "admin@gmail.com", "ADMIN", "Male"),
                new User("john", "john@gmail.com", "USER", "Male"),
                new User("peter", "peter@gmail.com", "USER", "Male")
        );

        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        List<User> users = Arrays.asList(
                new User("admin", "admin@gmail.com", "ADMIN", "Male"),
                new User("john", "john@gmail.com", "USER", "Male"),
                new User("peter", "peter@gmail.com", "USER", "Male")
        );

        model.addAttribute("users", users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User user = new User("admin", "admin@gmail.com", "USER", "Male");
        model.addAttribute("user", user);
        return "switch-case";
    }

    @GetMapping("register")
    public String userRegistration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        List<String> professions = Arrays.asList("Developer", "Tester");
        model.addAttribute("professions", professions);
        return "register-form";
    }

    @PostMapping("/register/save")
    public String submitForm(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("user",user);
        return "register-success";
    }


}
