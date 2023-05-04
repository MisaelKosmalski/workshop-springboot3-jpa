package com.misaexpress.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misaexpress.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}