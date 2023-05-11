package com.example.Restaurant.domain;

import jakarta.persistence.*;

import java.util.Date;



@Entity
@Table(name ="ResTables")
public class ResTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tableName;

    private int numberOfSeats;

    // constructors, getters, and setters

    public ResTable() {}

    public ResTable(String tableName, String reservedBy, int numberOfSeats, Date dateOfReserved, String date, String time) {
        this.tableName = tableName;
        this.numberOfSeats = numberOfSeats;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }





    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


}

