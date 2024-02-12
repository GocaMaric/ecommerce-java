package com.goca.ecommercejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goca.ecommercejava.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}