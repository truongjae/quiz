package com.truongjae.quiz.service;

import com.truongjae.quiz.dto.request.user.UserSaveRequest;

public interface UserService {
    void register(UserSaveRequest userSaveRequest);
}
