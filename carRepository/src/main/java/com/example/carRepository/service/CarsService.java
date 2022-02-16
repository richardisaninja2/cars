package com.example.carRepository.service;

import com.example.carRepository.entity.Cars;

import java.util.List;

public interface CarsService {
    List<Cars> getAll();
    Object getById(int id);
    void saveOrUpdate(Cars car);
    void deleteById(int theId);
}
