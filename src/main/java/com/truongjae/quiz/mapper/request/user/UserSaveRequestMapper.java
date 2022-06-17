package com.truongjae.quiz.mapper.request.user;

import com.truongjae.quiz.dto.request.user.UserSaveRequest;
import com.truongjae.quiz.entity.User;
import com.truongjae.quiz.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserSaveRequestMapper extends Mapper<User, UserSaveRequest> {
}
