package app.ecommerce.ecommercecore.Repository;

import app.ecommerce.ecommercecore.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
