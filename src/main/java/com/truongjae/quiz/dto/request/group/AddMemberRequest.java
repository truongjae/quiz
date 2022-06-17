package com.truongjae.quiz.dto.request.group;

import lombok.Data;

@Data
public class AddMemberRequest {
    private Long userId;
    private Long groupId;
}
