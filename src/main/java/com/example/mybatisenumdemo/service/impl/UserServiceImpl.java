package com.example.mybatisenumdemo.service.impl;

import com.example.mybatisenumdemo.dao.UserDao;
import com.example.mybatisenumdemo.entity.User;
import com.example.mybatisenumdemo.enums.GenderEnum;
import com.example.mybatisenumdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-11-08 11:00:44
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        user.setGender(GenderEnum.MAIL);
        this.userDao.insert(user);
        return user;
    }
}
