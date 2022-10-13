package br.com.drope.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
