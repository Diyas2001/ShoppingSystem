package com.example.ShoppingSystem.Services.Interfaces;

import com.example.ShoppingSystem.Tables.Orders;

import java.util.List;
import java.util.Optional;

public interface OrderServiceIn {
    void addOrder(Orders orders);
    void deleteOrder(Long id);
    void updateOrder(Long id, Orders orders);
    Optional<Orders> getOrderById(Long id);
    List<Orders> getAllOrders();
}
