package br.com.souzathg.firstspringapp.repositories;

import br.com.souzathg.firstspringapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
