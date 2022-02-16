package com.example.carRepository.controller.DAO;

import com.example.carRepository.entity.Cars;

import java.util.List;

public interface CarsDAO {
    List<Cars> getAll();
    Object getById(int id);
    void saveOrUpdate(Cars car);
    void deleteById(int theId);
}
