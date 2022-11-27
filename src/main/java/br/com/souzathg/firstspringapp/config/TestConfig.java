package br.com.souzathg.firstspringapp.config;

import br.com.souzathg.firstspringapp.entities.Category;
import br.com.souzathg.firstspringapp.entities.Order;
import br.com.souzathg.firstspringapp.entities.User;
import br.com.souzathg.firstspringapp.entities.enums.OrderStatus;
import br.com.souzathg.firstspringapp.repositories.CategoryRepository;
import br.com.souzathg.firstspringapp.repositories.OrderRepository;
import br.com.souzathg.firstspringapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(Instant.parse("2022-11-27T17:00:00-03:00"), OrderStatus.PAID, u1);
        Order o2 = new Order(Instant.parse("2022-11-27T16:00:00-03:00"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(Instant.parse("2022-11-27T18:00:00-03:00"), OrderStatus.WAITING_PAYMENT, u1);

        Category c1 = new Category("Electronics");
        Category c2 = new Category("Books");
        Category c3 = new Category("Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}
