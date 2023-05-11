package vn.smarthomeapiadmin.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import vn.smarthomeapiadmin.entity.Order;
import vn.smarthomeapiadmin.entity.OrderItem;
import vn.smarthomeapiadmin.repository.OrderItemRepository;
import vn.smarthomeapiadmin.service.IOrderItemService;

import java.util.List;

@Service
public class OrderItemServiceImpl implements IOrderItemService {


    @Autowired
    OrderItemRepository orderItemRepository;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public List<OrderItem> findAll(Sort sort) {
        return orderItemRepository.findAll(sort);
    }

    @Override
    public List<OrderItem> findAllById(Iterable<Integer> oderItemIds) {
        return orderItemRepository.findAllById(oderItemIds);
    }

    @Override
    public long count() {
        return orderItemRepository.count();
    }

    @Override
    public void deleteById(Integer orderItemId) {
        orderItemRepository.deleteById(orderItemId);
    }

    @Override
    public void deleteAll() {
        orderItemRepository.deleteAll();
    }

    @Override
    public OrderItem saveOrUpdate(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    @Query("SELECT c FROM OrderItem c WHERE c.order.orderId = :orderId")
    public List<OrderItem> listOrderItemsByOrderId(int orderId) {
        return orderItemRepository.listOrderItemsByOrderId(orderId);
    }
    @Override
    @Query("SELECT c.product.productId FROM OrderItem c WHERE c.order.orderId = :orderId")
    public List<Integer> listProductIdByOrderId(int orderId){
        return orderItemRepository.listProductIdByOrderId(orderId);
    }

    @Override
    public <S extends OrderItem> S save(S entity) {
        return orderItemRepository.save(entity);
    }

    @Override
    public List<OrderItem> findByOrder(Order order) {
        return orderItemRepository.findByOrder(order);
    }
}

