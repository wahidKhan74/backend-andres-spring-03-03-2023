package com.bahiazone.bahiazone.admin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahiazone.bahiazone.admin.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{

	List<Products> findByProductTitleContaining(String title);

}
