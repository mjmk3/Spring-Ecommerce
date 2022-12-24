package app.ecommerce.ecommercecore.Repository;

import app.ecommerce.ecommercecore.Entity.OrderProduct;
import app.ecommerce.ecommercecore.Entity.OrderProductPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductPK> {
}
