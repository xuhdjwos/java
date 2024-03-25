package com.mycode.finance.service;


import com.mycode.finance.entity.UserPayMoney;

import java.util.List;

public interface UserPayMoneyService {

    Integer insertUserPayMoney(UserPayMoney userPayMoney);

    List<UserPayMoney> selectUserPayMoneyByUserId(Integer userId);

    Integer updateUserPayMoney(UserPayMoney userPayMoney);

    UserPayMoney selectUserPayMoneyById(Integer id);
}
