package com.example.ShoppingSystem.Repository;
import com.example.ShoppingSystem.Tables.Users;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRep extends JpaRepository<Users, Long>{
    List<Users> findAll();
    @NotNull
    Optional<Users> findById(@NotNull Long id);
    Users findByUsername(String username);
}
