package com.example.Restaurant.controllers;

import com.example.Restaurant.domain.User;
import com.example.Restaurant.repositories.UserRepo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class RegistrationController {

    @Autowired
    private UserRepo userRepo;

    // Login form
    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
    @PostMapping("/login")
    public void login(@RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(loginRequest.getUsername());
    }

    class LoginRequest {

        private String username;
        private String password;

        public Object getUsername() {
            return this.username;
        }

        public Object getPassword() {
            return this.password;
        }

        // getters and setters
    }
    /*
    @GetMapping
    public String Registration(Model model){

        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        System. out. println("epta");
        User user = userRepo.findUserByUsername(username);
        if (user == null || !password.equals(user.getPassword())) {
            return "login";
        }
        return "reservation.html";
    }
    /*
    @PostMapping("/login")
    public String login() {
        return "reservation.html";
    }*/
    /*
    @PostMapping
    public String regUser(@ModelAttribute("user") User user, Model model){

        if (!user.getPassword().equals(user.getCheckPassword())) {
            model.addAttribute("errorConfPassword", true);
            return "login";
        }
        if (user.getPassword().length() < 3) {
            model.addAttribute("errorLenPassword", true);
            return "login";
        }
        if (userRepo.findUserByUsername(user.getUsername()) != null) {
            model.addAttribute("errorAlreadyExistsUsername", true);
            return "login";
        }
        try {
        userRepo.save(user);
        return "index.html";
        } catch (Exception e) {
        //model.addAttribute("errorAnomaly", true);
        return "login";
    }
    }*/


}