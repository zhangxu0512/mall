package com.galaxy.mall.usermanage.service;

import com.galaxy.mall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * @author 张旭
 * @create 2020-11-18 14:39
 */
public interface UserService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);

}
