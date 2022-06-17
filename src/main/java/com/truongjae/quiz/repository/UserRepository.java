package com.truongjae.quiz.repository;

import com.truongjae.quiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
