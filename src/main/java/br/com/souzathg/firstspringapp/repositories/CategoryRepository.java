package br.com.souzathg.firstspringapp.repositories;

import br.com.souzathg.firstspringapp.entities.Category;
import br.com.souzathg.firstspringapp.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
