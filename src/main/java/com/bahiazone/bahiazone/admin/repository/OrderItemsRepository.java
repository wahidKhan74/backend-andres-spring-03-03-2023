package com.bahiazone.bahiazone.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahiazone.bahiazone.admin.entity.Orders;

@Repository
public interface OrderItemsRepository extends JpaRepository<Orders, Integer>{

}
