package com.ad.weibo.adinf.service;

import com.ad.weibo.adinf.Dao.UserDao;
import com.ad.weibo.adinf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int insert(User user) {

        return userDao.insert(user);
    }

    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    public int update(User user) {
        return userDao.update(user);
    }

    public User getById(Integer id) {
        return userDao.getById(id);
    }

}
