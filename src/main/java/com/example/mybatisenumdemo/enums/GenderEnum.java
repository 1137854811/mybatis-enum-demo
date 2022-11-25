package com.example.mybatisenumdemo.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author： Aaron
 * @date： 2022-11-18 15:00
 */
@AllArgsConstructor
public enum GenderEnum implements DbEnum{

    MAIL(100, "男"),
    FEMAIL(101, "女"),
    UNKNOWN(102, "未知");
    ;


    private Integer key;

    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public Integer getKey() {
        return key;
    }
}
