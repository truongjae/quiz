package com.truongjae.quiz.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User extends BaseEntity{
    private String username;
    private String password;
    private String fullName;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "group_member",joinColumns = @JoinColumn(name = "member_id",nullable = false),
    inverseJoinColumns = @JoinColumn(name = "group_id",nullable = false))
    private List<Group> groups = new ArrayList<>();

    @OneToMany(mappedBy = "admin")
    private List<Group> adminGroup = new ArrayList<>();
}
