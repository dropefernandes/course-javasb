package br.com.drope.coursespring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.drope.coursespring.entities.Product;
import br.com.drope.coursespring.repositories.ProductRepository;
import br.com.drope.coursespring.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll () {
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> Product = productRepository.findById(id);
		return Product.orElseThrow(() -> new ResourceNotFoundException(id));
	}
}
