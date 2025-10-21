package com.example.lab3.service;

import com.example.lab3.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    public List<Vehicle> getServicesByYear(int year);
    public Optional<Vehicle> getTypeById(long id);

    public void deleteServicesByYear(int year);
}
