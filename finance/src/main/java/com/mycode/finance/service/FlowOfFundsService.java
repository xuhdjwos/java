package com.mycode.finance.service;

import com.mycode.finance.entity.FlowOfFunds;

import java.util.List;

public interface FlowOfFundsService {

    Integer insertFlowOfFunds(FlowOfFunds flowOfFunds);

    List<FlowOfFunds> selectFlowOfFundsByUserId(Integer userId);
}
