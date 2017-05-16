package com.myd.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by zhugp on 2017/4/19.
 */
public class JdbcTemplateUtils {
    private static JdbcTemplate jdbctemplate;

    public static JdbcTemplate jdbcTemplate() {
        if (jdbctemplate == null) {
            jdbctemplate = createJdbcTemplate();
        }
        return jdbctemplate;
    }

    private static JdbcTemplate createJdbcTemplate() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
        ds.setUrl("jdbc:db2://42.96.159.2:50000/dingwei2");
        ds.setUsername("db2inst");
        ds.setPassword("123qweasd");
        return new JdbcTemplate(ds);
    }
}
