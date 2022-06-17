package com.truongjae.quiz.service.impl;

import com.truongjae.quiz.dto.request.group.GroupSaveRequest;
import com.truongjae.quiz.entity.Group;
import com.truongjae.quiz.entity.User;
import com.truongjae.quiz.mapper.request.group.GroupSaveRequestMapper;
import com.truongjae.quiz.repository.GroupRepository;
import com.truongjae.quiz.repository.UserRepository;
import com.truongjae.quiz.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;
    private final GroupSaveRequestMapper groupSaveRequestMapper;
    private final UserRepository userRepository;
    @Override
    public void createGroup(GroupSaveRequest groupSaveRequest) {
        Group group = groupSaveRequestMapper.to(groupSaveRequest);
        group.setAdmin(userRepository.findById(3L).get());
        groupRepository.save(group);
    }

    @Override
    public void addMember(Long userId, Long groupId) {
        Group group = groupRepository.findById(groupId).get();
        User member = userRepository.findById(userId).get();
//        List<User> members = group.getUsers();
//        members.add(member);
//
//        group.setUsers(members);
//
//
//
//        groupRepository.save(group);
//
//        members.stream().forEach(user -> System.out.println(user.getUsername()));

        List<Group> groups = member.getGroups();
        groups.add(group);
        member.setGroups(groups);
        userRepository.save(member);
    }
}
