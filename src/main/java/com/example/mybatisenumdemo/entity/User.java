package com.example.mybatisenumdemo.entity;

import com.example.mybatisenumdemo.enums.GenderEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-11-08 11:00:42
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -72928128100049189L;
    
    private Long id;
    
    private String name;
    
    private String password;

    private GenderEnum gender;


}

