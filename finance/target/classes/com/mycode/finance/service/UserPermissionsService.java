package com.mycode.finance.service;

import com.mycode.finance.entity.UserPermissions;

import java.util.List;

public interface UserPermissionsService {

    List<UserPermissions> selectUserPermissionsByUserId(Integer userId);

    UserPermissions selectUserPermissionsByPermissionId(Integer permissionId);

    Integer insertUserPermissions(UserPermissions userPermissions);

    Integer UpdateUserPermissions(UserPermissions userPermissions);

    Integer deleteUserPermissionsByPermissionId(Integer permissionId);

    Integer deleteAllUserPermissionsByUserId(Integer userId);
}
