package com.cg.demo;

public class Login {

	private String password;

	@Override
	public String toString() {
		return "Login [password=" + password + ", username=" + username + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;
}
