package com.mycode.finance.service;

import com.mycode.finance.entity.News;

import java.util.List;

public interface NewsService {

    List<News> selectAllNews();
}
