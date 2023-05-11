package com.example.Restaurant.repositories;

import com.example.Restaurant.domain.ResTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResTableRepo extends JpaRepository<ResTable, Integer> {
}
