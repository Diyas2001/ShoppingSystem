package com.example.ShoppingSystem.Services.Interfaces;

import com.example.ShoppingSystem.Tables.Users;

import java.util.List;
import java.util.Optional;

public interface UserServiceIn {
    void addUser(Users users);
    void deleteUser(Long id);
    void updateUser(Long id, Users users);
    Optional<Users> getUserById(Long id);
    List<Users> getAllUsers();
}
