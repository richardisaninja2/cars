package com.example.carRepository.controller;

import com.example.carRepository.entity.Cars;
import com.example.carRepository.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class CarController {
    private final CarsService carsService;

    @Autowired
    public CarController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/findAll")
    public List<Cars> findAll(){
        return carsService.getAll();
    }

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable int id){
        return carsService.getById(id);
    }

    @PostMapping("/addCar")
    public Cars addCar(@RequestBody Cars car){

        car.setId(0);
        carsService.saveOrUpdate(car);
        return car;
    }

    @PutMapping("updateCar")
    public Cars updateCar(@RequestBody Cars car){
        carsService.saveOrUpdate(car);
        return car;
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        carsService.deleteById(id);
        return "The car with the id" +id+" has been deleted";
    }


}
