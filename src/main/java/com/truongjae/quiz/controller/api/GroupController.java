package com.truongjae.quiz.controller.api;

import com.truongjae.quiz.dto.request.group.AddMemberRequest;
import com.truongjae.quiz.dto.request.group.GroupSaveRequest;
import com.truongjae.quiz.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/group")
public class GroupController {
    private final GroupService groupService;

    @PostMapping("/create")
    public void createGroup(@RequestBody GroupSaveRequest groupSaveRequest){
        groupService.createGroup(groupSaveRequest);
    }
    @PostMapping("/addMember")
    public void addMember(@RequestBody AddMemberRequest addMemberRequest){
        groupService.addMember(addMemberRequest.getUserId(),addMemberRequest.getGroupId());
    }
}
