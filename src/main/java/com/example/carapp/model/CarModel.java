package com.example.carapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "c_details")
public class CarModel {
    public CarModel() {

    }

    public CarModel(int car_miles, String carname, String carcolor, int caryear, String carmodel) {
        this.carmiles = car_miles;
        this.carsname = carname;
        this.carscolour = carcolor;
        this.caryear = caryear;
        this.carmodel = carmodel;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "car_model")
    private String carmodel;
    @Column(name = "cars_name")
    private String carsname;
    @Column(name = "car_colour")
    private String carscolour;
    @Column(name = "car_year")
    private int caryear;

    @Column(name = "car_miles")
    private int  carmiles;

    public String getCar_model() {return carmodel;}

    public void setCar_model(String car_model) {this.carmodel = car_model;}

    public String getCar_name() {return carsname;}

    public void setCar_name(String cars_name) {this.carsname = cars_name;}

    public String getCars_colour() {return carscolour;}

    public void setCars_colour(String car_colour) {this.carscolour = car_colour;}

    public int getCar_year() {return caryear;}

    public void setCar_year(int car_year) {this.caryear = car_year;}

    public int getCar_miles() {return carmiles;}

    public void setCar_miles(int car_miles) {this.carmiles = car_miles;}
}
