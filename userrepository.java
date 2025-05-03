package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

@Repository
public class UserRepository {

    public User findUserById(long id) {
        // Simulate fetching a user from the database
        User user = new User();
        user.setName("Jane Doe");
        user.setEmail("jane.doe@example.com");
        return user;
    }
}
