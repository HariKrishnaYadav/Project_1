package com.hky.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hky.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByCode(String code);
}
