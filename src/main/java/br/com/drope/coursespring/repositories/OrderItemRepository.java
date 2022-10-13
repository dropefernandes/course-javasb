package br.com.drope.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.coursespring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
