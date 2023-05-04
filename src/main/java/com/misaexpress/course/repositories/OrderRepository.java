package com.misaexpress.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misaexpress.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
