package com.mycode.finance.service;

import com.mycode.finance.entity.TermFinancial;

import java.util.List;

public interface TermFinancialService {

    List<TermFinancial> selectAllTermFinancial();

    TermFinancial selectTermFinancialById(Integer id);

    Integer insertTermFinancial(TermFinancial termFinancial);

    Integer updateTermFinancial(TermFinancial termFinancial);

    Integer deleteTermFinancialById(Integer id);
}
