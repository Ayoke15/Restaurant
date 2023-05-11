package com.example.Restaurant.repositories;

import com.example.Restaurant.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
}
