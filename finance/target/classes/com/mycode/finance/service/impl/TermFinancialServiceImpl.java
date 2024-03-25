package com.mycode.finance.service.impl;

import com.mycode.finance.entity.TermFinancial;
import com.mycode.finance.mapper.TermFinancialMapper;
import com.mycode.finance.service.TermFinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TermFinancialServiceImpl implements TermFinancialService {
    @Autowired
    TermFinancialMapper termFinancialMapper;

    @Override
    public List<TermFinancial> selectAllTermFinancial() {
        return termFinancialMapper.selectByExample(null);
    }

    @Override
    public TermFinancial selectTermFinancialById(Integer id) {
        return termFinancialMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public Integer insertTermFinancial(TermFinancial termFinancial) {
        return termFinancialMapper.insertSelective(termFinancial);
    }

    @Override
    @Transactional
    public Integer updateTermFinancial(TermFinancial termFinancial) {
        return termFinancialMapper.updateByPrimaryKeySelective(termFinancial);
    }

    @Override
    @Transactional
    public Integer deleteTermFinancialById(Integer id) {
        return termFinancialMapper.deleteByPrimaryKey(id);
    }
}
