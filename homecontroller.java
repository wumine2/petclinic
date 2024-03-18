// HomeController.java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String email, Model model) {
        // Here, you can process the registration logic, such as saving the user to a database
        // For simplicity, let's just return a success message
        model.addAttribute("message", "Registration successful! Username: " + username + ", Email: " + email);
        return "success";
    }
}
