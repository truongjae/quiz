package com.truongjae.quiz.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quiz_group")
@Data
public class Group extends BaseEntity{
    private String name;

    @ManyToMany(mappedBy = "groups",fetch=FetchType.EAGER)
    private List<User> users = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private User admin;
}
