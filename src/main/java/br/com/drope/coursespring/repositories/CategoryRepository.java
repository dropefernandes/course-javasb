package br.com.drope.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
