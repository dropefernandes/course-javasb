package br.com.drope.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
