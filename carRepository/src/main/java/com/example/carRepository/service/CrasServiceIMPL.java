package com.example.carRepository.service;

import com.example.carRepository.controller.DAO.CarsDAO;
import com.example.carRepository.entity.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrasServiceIMPL implements CarsService{
    private final CarsDAO carsDAO;

    @Autowired
    public CrasServiceIMPL(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }


    @Override
    public List<Cars> getAll() {
        return carsDAO.getAll();
    }

    @Override
    public Object getById(int id) {
        return carsDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Cars car) {
        carsDAO.saveOrUpdate(car);
    }

    @Override
    public void deleteById(int theId) {
        carsDAO.deleteById(theId);
    }
}
