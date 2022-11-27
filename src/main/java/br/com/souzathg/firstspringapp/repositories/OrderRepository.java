package br.com.souzathg.firstspringapp.repositories;

import br.com.souzathg.firstspringapp.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
