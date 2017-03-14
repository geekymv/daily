package com.geekymv.daily.core.pojo;

import com.geekymv.daily.base.BaseModel;

public class User extends BaseModel {
	private static final long serialVersionUID = -5069605126575227017L;

	private String account;
	
	private String password;

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
