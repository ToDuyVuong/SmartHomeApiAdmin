package vn.smarthomeapiadmin.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import vn.smarthomeapiadmin.entity.Order;
import vn.smarthomeapiadmin.entity.User;
import vn.smarthomeapiadmin.repository.OrderRepository;
import vn.smarthomeapiadmin.service.IOrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {


    @Autowired
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(Integer orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public void deleteById(Integer orderId) {
        orderRepository.deleteById(orderId);
    }
    @Override
    public Order saveOrUpdate(Order order) {
        return orderRepository.save(order);
    }

    @Override
    @Query("SELECT c FROM Order c WHERE c.user.id = :id")
    public List<Order> listOrderByUserId(int id) {
        return orderRepository.listOrderByUserId(id);
    }

    @Override
    public <S extends Order> S save(S entity) {
        return orderRepository.save(entity);
    }

    @Override
    public List<Order> findByUser(User user) {
        return orderRepository.findByUser(user);
    }

    @Override
    public List<Order> findByUserId(String id) {
        return orderRepository.findByUserId(id);
    }

}

