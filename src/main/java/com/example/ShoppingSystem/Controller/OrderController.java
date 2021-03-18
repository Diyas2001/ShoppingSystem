package com.example.ShoppingSystem.Controller;

import com.example.ShoppingSystem.Services.OrderService;
import com.example.ShoppingSystem.Tables.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrols")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/list")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id).get();
    }

    @PostMapping("")
    public void addOrder(@RequestBody Orders orders) {
        orderService.addOrder(orders);
    }

    @PutMapping("/{id}")
    public void updateOrder(@PathVariable Long id,
                               @RequestBody Orders orders) {
        orderService.updateOrder(id, orders);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteOrder(id);
    }


}
