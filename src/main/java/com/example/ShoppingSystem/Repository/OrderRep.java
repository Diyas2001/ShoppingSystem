package com.example.ShoppingSystem.Repository;

import com.example.ShoppingSystem.Tables.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRep extends JpaRepository<Orders, Long> {
    List<Orders> findAll();
    Optional<Orders> findById(Long id);
}
