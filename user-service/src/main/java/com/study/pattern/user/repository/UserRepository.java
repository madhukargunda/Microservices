package com.study.pattern.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.pattern.user.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
