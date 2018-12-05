package com.ad.weibo.adinf.Dao;

import com.ad.weibo.adinf.entity.User;

public interface UserDao {
    int insert(User users);

    int deleteById(Integer id);

    int update(User users);

    User getById(Integer id);

}
