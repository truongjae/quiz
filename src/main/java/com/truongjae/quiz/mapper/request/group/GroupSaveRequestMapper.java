package com.truongjae.quiz.mapper.request.group;

import com.truongjae.quiz.dto.request.group.GroupSaveRequest;
import com.truongjae.quiz.entity.Group;
import com.truongjae.quiz.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface GroupSaveRequestMapper extends Mapper<Group, GroupSaveRequest> {
}
