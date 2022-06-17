package com.truongjae.quiz.service.impl;

import com.truongjae.quiz.dto.request.user.UserSaveRequest;
import com.truongjae.quiz.entity.User;
import com.truongjae.quiz.mapper.request.user.UserSaveRequestMapper;
import com.truongjae.quiz.repository.UserRepository;
import com.truongjae.quiz.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserSaveRequestMapper userSaveRequestMapper;
    private final UserRepository userRepository;
    @Override
    public void register(UserSaveRequest userSaveRequest) {
        User user = userSaveRequestMapper.to(userSaveRequest);
        userRepository.save(user);
    }
}
