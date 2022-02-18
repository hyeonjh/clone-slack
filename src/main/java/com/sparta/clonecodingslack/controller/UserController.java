package com.sparta.clonecodingslack.controller;

import com.sparta.clonecodingslack.dto.UserRequestDto;
import com.sparta.clonecodingslack.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @PostMapping("/user/signup")
    public ResponseEntity<String> signup(@RequestBody UserRequestDto requestDto) {
        userService.registerUser(requestDto);
        return ResponseEntity.ok().body("성공");
    }

//    @GetMapping("/user/signView")
//    public String signup() {return "signup";}
}
