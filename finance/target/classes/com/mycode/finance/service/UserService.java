package com.mycode.finance.service;

import com.mycode.finance.entity.User;

import java.util.List;

public interface UserService {

    User selectUserByTerms(String username, String password);

    List<User> selectUserByStatusDesc();

    List<User> selectAllUser();

    Integer updateUser(User user);

    Integer insertUser(User user);

    User selectUserById(Integer id);

    Integer deleteUserById(Integer id);
}
