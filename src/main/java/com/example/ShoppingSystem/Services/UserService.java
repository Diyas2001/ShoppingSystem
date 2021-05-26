package com.example.ShoppingSystem.Services;

import com.example.ShoppingSystem.Repository.UserRep;
import com.example.ShoppingSystem.Services.Interfaces.UserServiceIn;
import com.example.ShoppingSystem.Tables.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceIn, UserDetailsService {
    @Autowired
    private UserRep userRep;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void addUser(Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        userRep.saveAndFlush(users);
    }

    @Override
    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }

    @Override
    public void updateUser(Long id, Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        users.setId(id);
        userRep.saveAndFlush(users);
    }

    @Override
    public Optional<Users> getUserById(Long id) {
        return userRep.findById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRep.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users users = userRep.findByUsername(s);
        if (users == null) {
            throw new UsernameNotFoundException("User " + s + " not found.");
        }
        return users;
    }
}
