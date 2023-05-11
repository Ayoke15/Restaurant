package com.example.Restaurant.controllers;

import com.example.Restaurant.domain.ResTable;
import com.example.Restaurant.repositories.ResTableRepo;
import com.example.Restaurant.repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reserved-tables")
public class ResTableController {

    @Autowired
    private ResTableRepo resTableRepo;
    @GetMapping
    public String ResTable(Model model){
        List<ResTable> ResTableList = resTableRepo.findAll();
        model.addAttribute("ResTableList", ResTableList);
        return "restables.html";
    }

}
