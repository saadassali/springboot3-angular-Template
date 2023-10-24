package com.divide.by.zero.security.auth.service;

import com.divide.by.zero.security.auth.service.dto.AuthenticationRequest;
import com.divide.by.zero.security.auth.service.dto.AuthenticationResponse;
import jakarta.servlet.http.Cookie;

public interface AuthService {
    AuthenticationResponse authenticateForToken(AuthenticationRequest authenticationRequest);

    Cookie authenticateForCookie(AuthenticationRequest authenticationRequest);
}
