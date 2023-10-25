package com.ecommerce.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {

}
