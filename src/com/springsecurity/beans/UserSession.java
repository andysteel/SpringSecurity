package com.springsecurity.beans;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springsecurity.entities.User;

@Component
@Scope("session")
public class UserSession implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean isLoggedIn(){
		return user != null;
	}
}
