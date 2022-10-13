package br.com.drope.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drope.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
