package com.example.todo_management.controller;

import com.example.todo_management.dto.LoginRequestDto;
import com.example.todo_management.utils.JwtUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
@AllArgsConstructor
public class UserController {
    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequestDto requestDto) {
        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken(requestDto.getUsername(), requestDto.getPassword());
        authenticationManager.authenticate(token);
        // generate jwt
        String jwt = jwtUtil.generate(requestDto.getUsername());
        return new ResponseEntity<>(jwt, HttpStatus.OK);
    }

}
