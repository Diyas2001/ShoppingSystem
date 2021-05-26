package com.example.ShoppingSystem.Controller;

import com.example.ShoppingSystem.Tables.Products;
import com.example.ShoppingSystem.Tables.Users;
import com.example.ShoppingSystem.Services.UserService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/list")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/allUsersPage")
    public String allUsersPage(Model model){
        model.addAttribute("users",getAllUsers());
        return "userList";
    }


    @ResponseBody
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id).get();
    }

    @ResponseBody
    @PostMapping("")
    public void addUser(@RequestBody Users users) {
        userService.addUser(users);
    }

    @ResponseBody
    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,
                               @RequestBody Users users) {
        userService.updateUser(id, users);
    }
    @ResponseBody
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }


}
