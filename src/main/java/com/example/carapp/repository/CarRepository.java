package com.example.carapp.repository;

import com.example.carapp.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<CarModel,String >{
 Optional<CarModel> findBycarsname(String cname);
 Optional<List<CarModel>> findAllBycarscolour(String carscolour);




}
