package com.example.insurance.controller;

import com.example.insurance.entity.User;
import com.example.insurance.repository.UserRepository;
import com.example.insurance.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        user.setRole("USER"); // default role
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        User dbUser = userRepository.findByEmail(user.getEmail()).orElseThrow();
        if(dbUser.getPassword().equals(user.getPassword())){
            return jwtUtil.generateToken(dbUser.getEmail());
        }
        throw new RuntimeException("Invalid credentials");
    }
}
