package com.truongjae.quiz.controller.api;

import com.truongjae.quiz.dto.request.user.UserSaveRequest;
import com.truongjae.quiz.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserSaveRequest userSaveRequest){
        userService.register(userSaveRequest);
    }
}
