package com.bookstore.repository;

import com.bookstore.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
