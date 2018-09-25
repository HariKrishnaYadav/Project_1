package com.hky.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.hky.model.Category;
import com.hky.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {
	List<Product> findAllByOrderByProductViewsDesc();

	List<Product> findAllByProductCategory(Category category);
}
