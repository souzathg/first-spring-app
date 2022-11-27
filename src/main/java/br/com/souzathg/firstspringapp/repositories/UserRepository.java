package br.com.souzathg.firstspringapp.repositories;


import br.com.souzathg.firstspringapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
