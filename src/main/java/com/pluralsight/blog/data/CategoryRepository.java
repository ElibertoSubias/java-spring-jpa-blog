package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
