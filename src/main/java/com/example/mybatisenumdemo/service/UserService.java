package com.example.mybatisenumdemo.service;


import com.example.mybatisenumdemo.entity.User;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-11-08 11:00:43
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);
}
