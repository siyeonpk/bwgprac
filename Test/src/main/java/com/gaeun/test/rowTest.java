package com.gaeun.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class rowTest {
	
//	public static Connection makeConnection() {
//		
//		String url = "jdbc:mariadb://localhost:3306/sample";
//		String id = "gaeun";
//		String password = "gaeun";
//		Connection con = null;	
//		
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			System.out.println("드라이버 설정 완료");
//			con = DriverManager.getConnection(url, id, password);
//			System.out.println("데이터베이스 연결 성공");
//		}catch(ClassNotFoundException e) {
//			System.out.println("드라이버 찾기 실패");
//			System.out.println(e.getMessage());
//		}catch(SQLException e) {
//			System.out.println("연결 실패");
//		}
//		
//		return con;
//		
//	}
//	
//	public static void main(String[] args) {
//
//		try {
//			Connection con = makeConnection();
//			Statement st = null;
//			String query = "select user_name from user_info where user_id='?";
//			ResultSet rs = st.
//			
//			while(rs.next()) {
//				System.out.println("회원 이름 : [" + rs.getString("user_name") + "]");
//			}
//			
//			con.close();
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
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
