package com.mycode.finance.service;

import com.mycode.finance.entity.Info;

import java.util.List;

public interface InfoService {

    List<Info> selectInfoOrderByUserIdDesc(Integer receiveid);

    Info selectInfoById(Integer id);

    Integer insertInfo(Info info);

    Integer updateInfo(Info info);

    Integer deleteInfobyId(Integer id);
}
