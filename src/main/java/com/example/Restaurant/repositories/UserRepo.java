package com.example.Restaurant.repositories;

import com.example.Restaurant.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
}
