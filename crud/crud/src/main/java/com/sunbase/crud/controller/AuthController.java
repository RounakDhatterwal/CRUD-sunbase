package com.sunbase.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbase.crud.entity.JwtUtil;
import com.sunbase.crud.entity.User;
import com.sunbase.crud.services.UserService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/") 
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

	/*
	 * @PostMapping("/login") public ResponseEntity<String> login(@RequestBody User
	 * loginUser) { User user = userService.findByEmail(loginUser.getEmail()); if
	 * (user != null && new BCryptPasswordEncoder().matches(loginUser.getPassword(),
	 * user.getPassword())) { String token = jwtUtil.generateToken(user.getEmail());
	 * return ResponseEntity.ok(token); } return
	 * ResponseEntity.status(401).body("Invalid email or password"); }
	 */
}