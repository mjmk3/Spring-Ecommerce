package app.ecommerce.ecommercecore.Service.Impl;

import app.ecommerce.ecommercecore.Entity.Order;
import app.ecommerce.ecommercecore.Service.OrderService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    // orderRepository constructor injection

    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}
