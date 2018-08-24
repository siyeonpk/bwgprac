package com.gaeun.test.model;

import java.sql.Date;

public class UserVO {

	private String userId;
	private transient String password;
	private String userName;
	private Date regDate;
	private String contact;
	private String address;
	private Date birth;
	private String gender;
	private String register;
	private Date regTime;
	private String editor;
	private Date editTime;
	
	//Insert 받아올 때 Date 타입의 경우
	//new Date().toString(); 으로 받아서 (이건 java.util.date 임)
	//SimpleDateFormat 변수 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	//이거는 어떻게 할 지 상의해보는게 나을듯 (String 타입으로 저장할지 Date로 그냥 받을지)
	//Service? Dao? 둘 중 어느 쪽이든 저 과정 실행시켜줘야함
	public UserVO(String userId, String password, String userName, Date regDate, String contact, String address,
			Date birth, String gender, String register, Date regTime, String editor, Date editTime) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.regDate = regDate;
		this.contact = contact;
		this.address = address;
		this.birth = birth;
		this.gender = gender;
		this.register = register;
		this.regTime = regTime;
		this.editor = editor;
		this.editTime = editTime;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getBirth() {
		return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getRegister() {
		return register;
	}
	
	public void setRegister(String register) {
		this.register = register;
	}
	
	public Date getRegTime() {
		return regTime;
	}
	
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	
	public String getEditor() {
		return editor;
	}
	
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public Date getEditTime() {
		return editTime;
	}
	
	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userName=" + userName + ", regDate=" + regDate + ", contact=" + contact
				+ ", address=" + address + ", birth=" + birth + ", gender=" + gender + ", register=" + register
				+ ", regTime=" + regTime + ", editor=" + editor + ", editTime=" + editTime + "]";
	}
	
}