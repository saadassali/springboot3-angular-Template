package com.divide.by.zero.security.users.service;


import com.divide.by.zero.security.users.model.User;
import com.divide.by.zero.security.users.requests.UserRequest;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User addUser(UserRequest user);
}
