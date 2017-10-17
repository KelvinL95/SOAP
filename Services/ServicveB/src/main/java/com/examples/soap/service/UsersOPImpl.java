package com.examples.soap.service;

import java.util.ArrayList;
import java.util.List;

import com.examples.soap.model.User;

public class UsersOPImpl implements IUsersOP {

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();

		users.add(new User("unescommand", "password", "1@mail.com", 20));
		users.add(new User("kaymore", "password", "2@mail.com", 18));
		users.add(new User("starbaby", "password", "3@mail.com", 24));
		users.add(new User("appropriate2", "password", "4@mail.com", 19));
		users.add(new User("username", "password", "5@mail.com", 21));

		return users;
	}

	@Override
	public User getUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(User u) {
//		System.out.println("user: "+u);
		return "Successfully added "+u.getUsername();
	}

}
