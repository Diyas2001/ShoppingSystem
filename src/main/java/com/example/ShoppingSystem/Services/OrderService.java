package com.example.ShoppingSystem.Services;

import com.example.ShoppingSystem.Repository.OrderRep;
import com.example.ShoppingSystem.Services.Interfaces.OrderServiceIn;
import com.example.ShoppingSystem.Tables.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements OrderServiceIn {

    @Autowired
    OrderRep orderRep;

    @Override
    public void addOrder(Orders orders) {
        orderRep.saveAndFlush(orders);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRep.deleteById(id);
    }

    @Override
    public void updateOrder(Long id, Orders orders) {
        orders.setId(id);
        orderRep.saveAndFlush(orders);
    }

    @Override
    public Optional<Orders> getOrderById(Long id) {
        return orderRep.findById(id);
    }

    @Override
    public List<Orders> getAllOrders() {
        return orderRep.findAll();
    }
}
