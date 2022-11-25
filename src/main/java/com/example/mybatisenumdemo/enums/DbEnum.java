package com.example.mybatisenumdemo.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

/**
 * @author： Aaron
 * @date： 2022-11-18 15:12
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public interface DbEnum extends Serializable {
    public Integer getKey();

}
