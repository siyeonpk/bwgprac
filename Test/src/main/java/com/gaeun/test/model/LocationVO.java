package com.gaeun.test.model;

import java.sql.Date;

public class LocationVO {

	private String locationCode;
	private String locationName;
	private String register;
	private Date regTime;
	private String editor;
	private Date editTime;
	
	public LocationVO(String locationCode, String locationName, String register, Date regTime, String editor,
			Date editTime) {
		super();
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.register = register;
		this.regTime = regTime;
		this.editor = editor;
		this.editTime = editTime;
	}
	
	public String getLocationCode() {
		return locationCode;
	}
	
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	
	public String getLocationName() {
		return locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
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
		return "LocationVO [locationCode=" + locationCode + ", locationName=" + locationName + ", register=" + register
				+ ", regTime=" + regTime + ", editor=" + editor + ", editTime=" + editTime + "]";
	}
	
	
	
}
