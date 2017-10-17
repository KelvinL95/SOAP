package com.examples.soap.service;

import java.util.List;

import javax.jws.WebService;

import com.examples.soap.model.User;

@WebService
public interface IUsersOP {
	
	List<User> getUsers();
	User getUser(User u);
	User getUserById(long id);
	String addUser(User u);
	
}
