package com.example.ShoppingSystem.Repository;
import com.example.ShoppingSystem.Tables.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRep extends JpaRepository<Products, Long>{
    List<Products> findAll();
    Optional<Products> findById(Long id);
}
