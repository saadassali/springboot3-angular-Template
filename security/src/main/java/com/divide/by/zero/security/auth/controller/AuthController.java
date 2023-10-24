package com.divide.by.zero.security.auth.controller;

import com.divide.by.zero.security.auth.service.AuthService;
import com.divide.by.zero.security.auth.service.dto.AuthenticationRequest;
import com.divide.by.zero.security.auth.service.dto.AuthenticationResponse;
import com.divide.by.zero.security.exception.AuthenticationException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController implements AuthenticationApi {

    private final HttpServletResponse response;

    private final AuthService authService;


//    @PostMapping("")
//    public ResponseEntity<AuthenticationResponse> authenticate(
//            @RequestBody AuthenticationRequest authenticationRequest
//    ) {
//        return authenticateForToken(authenticationRequest);
//    }
    @Override
    public ResponseEntity authenticateForCookie( final AuthenticationRequest authenticationRequest) {
        try {
            Cookie cookie = authService.authenticateForCookie(authenticationRequest);
            response.addCookie(cookie);
            return ResponseEntity.ok().build();
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    @PostMapping
    public ResponseEntity<AuthenticationResponse> authenticateForToken(@RequestBody final AuthenticationRequest authenticationRequest) {
        try {
            return ResponseEntity.ok(authService.authenticateForToken(authenticationRequest));
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
