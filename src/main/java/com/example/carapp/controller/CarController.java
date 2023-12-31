package com.example.carapp.controller;

import com.example.carapp.model.CarModel;
import com.example.carapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/Cars")

    public List<CarModel> getAllcars() {
        return carRepository.findAll();
    }

    @GetMapping("/Cars/name/{cname}")
    public Optional<CarModel> getbycars(@PathVariable(value = "cname") String carname) {

        return carRepository. findBycarsname(carname);
    }
    @GetMapping("/Cars/Colour/{ccolour}")
    public Optional<List<CarModel>> getbyproducttype(@PathVariable(value ="ccolour")String carscolor){
        return carRepository.findAllBycarscolour(carscolor);
    }

}

