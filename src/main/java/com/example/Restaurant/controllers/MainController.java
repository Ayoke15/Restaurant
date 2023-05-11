package com.example.Restaurant.controllers;

import org.springframework.ui.Model;
import com.example.Restaurant.domain.ResTable;
import com.example.Restaurant.domain.Reservation;
import com.example.Restaurant.repositories.ResTableRepo;
import com.example.Restaurant.repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class MainController {

    @Autowired
    ReservationRepo reservationRepo;
    @Autowired
    ResTableRepo resTableRepo;

    @GetMapping
    public String mainmen(Model model){
        List<Reservation> reservationList = reservationRepo.findAll();
        List<ResTable> resTableList = resTableRepo.findAll();
        model.addAttribute("reservation", reservationList);
        model.addAttribute("resTable", resTableList);
        return "admin";
    }
}
