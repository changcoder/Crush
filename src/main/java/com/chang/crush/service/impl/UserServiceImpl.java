package com.chang.crush.service.impl;

import com.chang.crush.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Override
    public List<Map<String, Object>> getUser() {
        String sql = "select * from bdf2_user";
        return jdbcTemplate1.queryForList(sql);
    }

    @Override
    public List<Map<String, Object>> getSecond() {
        String sql = "select * from v_account_statement";
        return jdbcTemplate2.queryForList(sql);
    }
}
