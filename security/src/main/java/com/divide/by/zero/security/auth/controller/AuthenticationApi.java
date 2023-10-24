package com.divide.by.zero.security.auth.controller;

import com.divide.by.zero.security.auth.service.dto.AuthenticationRequest;
import com.divide.by.zero.security.auth.service.dto.AuthenticationResponse;
import org.springframework.http.ResponseEntity;

public interface AuthenticationApi {
    ResponseEntity authenticateForCookie(final AuthenticationRequest authenticationRequest);
    ResponseEntity<AuthenticationResponse> authenticateForToken(final AuthenticationRequest authenticationRequest);
}
