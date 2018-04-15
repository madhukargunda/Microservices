package com.study.pattern.user.service;

import java.util.List;

import com.study.pattern.user.domain.User;

public interface UserService {

    User save(User user);

    List<User> getList();

}
