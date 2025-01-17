package com.kousoft.user.service;

import java.util.List;

import com.kousoft.user.model.User;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
