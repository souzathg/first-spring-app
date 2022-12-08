package br.com.souzathg.firstspringapp.repositories;

import br.com.souzathg.firstspringapp.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
