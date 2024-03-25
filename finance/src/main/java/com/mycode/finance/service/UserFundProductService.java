package com.mycode.finance.service;

import com.mycode.finance.entity.UserFundProduct;

import java.util.List;

public interface UserFundProductService {

    Integer insertUserFundProduct(UserFundProduct userFundProduct);

    List<UserFundProduct> selectUserFundProductByUserId(Integer userId);

    Integer updateUserFundProduct(UserFundProduct userFundProduct);

    UserFundProduct selectUserFundProductById(Integer id);
}
