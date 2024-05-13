package com.integrative.topics.integrativetopics.controllers;

import com.integrative.topics.integrativetopics.services.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserAuthController {

    @Autowired
    private UserAuthService userAuthService;

    @PostMapping()
    public boolean authUser(@RequestBody String enrollment){
        return userAuthService.authLogin(enrollment);
    }

}
