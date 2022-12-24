package app.ecommerce.ecommercecore.Repository;

import app.ecommerce.ecommercecore.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
