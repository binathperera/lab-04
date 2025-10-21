package com.example.lab3.service.impl;

import com.example.lab3.model.Vehicle;
import com.example.lab3.repository.VehicleRepository;
import com.example.lab3.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository repository;
    @Override
    public List<Vehicle> getServicesByYear(int year) {
        return repository.findByYear(year);
    }

    @Override
    public Optional<Vehicle> getTypeById(long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteServicesByYear(int year) {
        repository.deleteByYear(year);
    }
}
