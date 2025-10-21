package com.example.lab3.controller;

import com.example.lab3.model.Vehicle;
import com.example.lab3.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
@CrossOrigin(origins = "*")
public class VehicleController {

    @Autowired
    VehicleService service;

    @GetMapping("{year}")
    public List<Vehicle> getServicesByYear(@PathVariable("year") int year){
        return service.getServicesByYear(year);
    }

    @GetMapping("/detail/{id}")
    public String getTypeById(@PathVariable("id") long id){
        return service.getTypeById(id).get().getType();
    }

    @DeleteMapping("{year}")
    public ResponseEntity<Boolean> deleteServicesByYear(@PathVariable("year") int year) {
        service.deleteServicesByYear(year);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
