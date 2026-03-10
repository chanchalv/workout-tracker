package com.chanchal.workout_tracker.controller;

import com.chanchal.workout_tracker.dto.AuthRequest;
import com.chanchal.workout_tracker.dto.AuthResponse;
import com.chanchal.workout_tracker.entity.User;
import com.chanchal.workout_tracker.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public AuthResponse signup(@RequestBody User user) {
        return authService.signup(user);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.login(request);
    }
}