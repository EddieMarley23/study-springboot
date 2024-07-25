package com.javaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.course.entities.OrderItem;
import com.javaspring.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	

}
