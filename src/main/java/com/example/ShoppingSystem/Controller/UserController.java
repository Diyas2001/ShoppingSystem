package com.example.ShoppingSystem.Controller;

import com.example.ShoppingSystem.Tables.Products;
import com.example.ShoppingSystem.Tables.Users;
import com.example.ShoppingSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id).get();
    }

    @PostMapping("")
    public void addUser(@RequestBody Users users) {
        userService.addUser(users);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,
                               @RequestBody Users users) {
        userService.updateUser(id, users);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }


}
