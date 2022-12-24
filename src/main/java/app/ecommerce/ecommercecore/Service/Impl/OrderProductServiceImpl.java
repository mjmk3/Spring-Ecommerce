package app.ecommerce.ecommercecore.Service.Impl;

import app.ecommerce.ecommercecore.Entity.OrderProduct;
import app.ecommerce.ecommercecore.Repository.OrderProductRepository;
import app.ecommerce.ecommercecore.Service.OrderProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    @Autowired
    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
