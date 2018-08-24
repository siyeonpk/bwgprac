package com.gaeun.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class rowTest {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String selectUserId() {
		String sql = "select user_id from user_info where user_name=?";
		try {
			return jdbcTemplate.queryForObject(sql, String.class, "김바나나");
		}catch(EmptyResultDataAccessException e) {
			return "해당되는 유저 아이디가 없습니다.";
		}
	}
	
	public String selectUserName() {
		String sql = "select user_name from user_info where user_id=?";
		try {
			return jdbcTemplate.queryForObject(sql, String.class, "BANANA");
		}catch(EmptyResultDataAccessException e) {
			return "해당되는 유저 이름이 없습니다.";
		}
	}

}
