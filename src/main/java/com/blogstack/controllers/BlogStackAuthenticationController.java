package com.blogstack.controllers;

import com.blogstack.beans.request.SignInRequestBean;
import com.blogstack.beans.request.SignUpRequestBean;
import com.blogstack.service.IBlogStackAuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController

@RequestMapping(path = "${iam-service-version}/authentication")
@CrossOrigin("*")
public class BlogStackAuthenticationController {

    @Autowired
    private IBlogStackAuthenticationService blogStackAuthenticationService;

    @PostMapping(value = "/sign-up/")
    public Optional<?> signUp(@RequestParam(required = false)MultipartFile blogStackUserProfilePhoto,@Valid @RequestBody SignUpRequestBean signUpRequestBean) throws IOException {
        return this.blogStackAuthenticationService.signUp(signUpRequestBean,blogStackUserProfilePhoto);
    }

    @PostMapping(value = "/sign-in/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<?> signIn(@Valid @RequestBody SignInRequestBean signInRequestBean) {
        return this.blogStackAuthenticationService.signIn(signInRequestBean);
    }

    @PostMapping(value = "/refresh-token/{token}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<?> refreshToken(@PathVariable String token){
        return this.blogStackAuthenticationService.refreshTokens(token);
    }

}
