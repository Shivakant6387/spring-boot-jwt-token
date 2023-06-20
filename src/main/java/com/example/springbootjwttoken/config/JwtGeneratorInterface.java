package com.example.springbootjwttoken.config;



import com.example.springbootjwttoken.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {
    Map<String, String> generateToken(User user);

}
