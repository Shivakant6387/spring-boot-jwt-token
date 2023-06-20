package com.example.springbootjwttoken.service;

import com.example.springbootjwttoken.model.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);

    public User getUserByNameAndPassword(String name, String password) throws UsernameNotFoundException;
}
