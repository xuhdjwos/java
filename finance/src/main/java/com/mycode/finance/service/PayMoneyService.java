package com.mycode.finance.service;

import com.mycode.finance.entity.PayMoney;

import java.util.List;

public interface PayMoneyService {

    List<PayMoney> selectAllPayMoney();

    PayMoney selectPayMoneyById(Integer id);

    Integer insertPayMoney(PayMoney payMoney);

    Integer updatePayMoney(PayMoney payMoney);

    Integer deletePayMoneyById(Integer id);
}
