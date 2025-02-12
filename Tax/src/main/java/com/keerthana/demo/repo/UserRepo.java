package com.keerthana.demo.repo;

import java.util.List;

import com.keerthana.demo.model.User;

public interface UserRepo {

		public User insertUser(User newUser);

		public User updateUser(User user);

		public List<User> getUsers();

		public User userfind(int userId);

		public List<Integer> getUserIdlist();

		public List<User> searchUser(String userName);

		public User userLogin(String userName, String userPassword);

		public List<User> getUsersIdlist(int userId);
		
	}

	

