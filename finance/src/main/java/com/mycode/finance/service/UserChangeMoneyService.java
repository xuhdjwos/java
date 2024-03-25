package com.mycode.finance.service;

import com.mycode.finance.entity.UserChangeMoney;

import java.util.List;

public interface UserChangeMoneyService {

    Integer insertUserChangeMoney(UserChangeMoney userChangeMoney);

    List<UserChangeMoney> selectUserChangeMoneyByUserId(Integer userId);

    Integer updateUserChangeMoney(UserChangeMoney userChangeMoney);

    UserChangeMoney selectUserChangeMoneyById(Integer id);
}
