package com.mycode.finance.service;

import com.mycode.finance.entity.Admin;

public interface AdminService {

    Admin selectAdminByTerms(String username, String password);

    Integer updateAdmin(Admin admin);

    Admin selectAdminById(Integer id);
}
