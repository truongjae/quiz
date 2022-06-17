package com.truongjae.quiz.service;

import com.truongjae.quiz.dto.request.group.GroupSaveRequest;

public interface GroupService {
    void createGroup(GroupSaveRequest groupSaveRequest);
    void addMember(Long userId, Long groupId);
}
