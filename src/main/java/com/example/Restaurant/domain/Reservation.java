package com.example.Restaurant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;

@Data
@Entity
@Table(name = "reservation")
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private String reservedBy;
    private int table_id;
    private String dateOfRes;
    private String timeOfRes;
    private String notes;
    private String phoneNumber;


}