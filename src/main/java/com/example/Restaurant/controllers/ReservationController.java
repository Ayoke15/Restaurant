package com.example.Restaurant.controllers;

import com.example.Restaurant.domain.ResTable;
import com.example.Restaurant.domain.Reservation;
import com.example.Restaurant.repositories.ResTableRepo;
import com.example.Restaurant.repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationRepo reservationRepo;

    private ResTableRepo resTableRepo;

    @Autowired
    public ReservationController(ReservationRepo reservationRepo,ResTableRepo resTableRepo){
        this.reservationRepo = reservationRepo;
        this.resTableRepo = resTableRepo;
    }
    @GetMapping
    public String reserve(Model model){
        List<ResTable> resTableList = resTableRepo.findAll();
        model.addAttribute("resTable", resTableList);
        model.addAttribute("ResForm", new Reservation());
        return "reservation";
    }
    @PostMapping
    public String addReservation(@ModelAttribute("ResForm") Reservation resForm, Model model) {
        reservationRepo.save(resForm);
        return "index.html";
    }
}
