package com.mycode.finance.service.impl;

import com.mycode.finance.entity.UserPayMoney;
import com.mycode.finance.entity.UserPayMoneyExample;
import com.mycode.finance.mapper.UserPayMoneyMapper;
import com.mycode.finance.service.UserPayMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserPayMoneyServiceImpl implements UserPayMoneyService {

    @Autowired
    UserPayMoneyMapper userPayMoneyMapper;

    @Override
    @Transactional
    public Integer insertUserPayMoney(UserPayMoney userPayMoney) {
        return userPayMoneyMapper.insertSelective(userPayMoney);
    }

    @Override
    public List<UserPayMoney> selectUserPayMoneyByUserId(Integer userId) {
        UserPayMoneyExample upme = new UserPayMoneyExample();
        upme.createCriteria().andUseridEqualTo(userId);
        return userPayMoneyMapper.selectByExampleWithUserAndPayMoney(upme);
    }

    @Override
    @Transactional
    public Integer updateUserPayMoney(UserPayMoney userPayMoney) {
        return userPayMoneyMapper.updateByPrimaryKeySelective(userPayMoney);
    }

    @Override
    public UserPayMoney selectUserPayMoneyById(Integer id) {
        return userPayMoneyMapper.selectByPrimaryKeyWithUserAndPayMoney(id);
    }
}
