package com.misaexpress.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misaexpress.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
