package com.example.mybatisenumdemo.handler;

import com.example.mybatisenumdemo.enums.DbEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 * @author dev
 */
public class EnumTypeHandler extends BaseTypeHandler<DbEnum> {

    private Class<DbEnum> enumClass;

    public EnumTypeHandler(Class<DbEnum> enumClass) {
        this.enumClass = enumClass;
    }

    /**
     * 设置存入数据库的值
     * @param preparedStatement
     * @param i
     * @param dbEnum
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, DbEnum dbEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, dbEnum.getKey());
    }

    /**
     * 从数据库返回的处理
     * @param resultSet
     * @param s
     * @return
     * @throws SQLException
     */
    @Override
    public DbEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int anInt = resultSet.getInt(s);
        return getEnum(anInt);
    }

    /**
     * 用来查询操作，直接利用结果集返回，columnName为列名
     * @param resultSet
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public DbEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getEnum(resultSet.getInt(i));
    }

    /**
     * 用来存储过程的查询操作，直接利用结果集返回，columnIndex是列索引
     * @param callableStatement
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public DbEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getEnum(callableStatement.getInt(i));
    }

    private DbEnum getEnum(Integer key) {
        DbEnum[] enumConstants = enumClass.getEnumConstants();
        if (Objects.nonNull(enumConstants)) {
            for (DbEnum enumConstant : enumConstants) {
                if (Objects.equals(enumConstant.getKey(), key)) {
                    return enumConstant;
                }
            }
        }
        return null;
    }
}
