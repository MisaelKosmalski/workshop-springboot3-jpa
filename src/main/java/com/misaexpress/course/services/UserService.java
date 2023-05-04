package com.misaexpress.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misaexpress.course.entities.User;
import com.misaexpress.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional <User> obj = repository.findById(id);
		return obj.get();
	}
}