package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "owner_id")
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<ParkingSpot> listOfParkingSpots;

    public Owner(String name, List<ParkingSpot> listOfParkingSpots) {
        this.name = name;
        this.listOfParkingSpots = listOfParkingSpots;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingSpot> getListOfParkingSpots() {
        return listOfParkingSpots;
    }

    public void setListOfParkingSpots(List<ParkingSpot> listOfParkingSpots) {
        this.listOfParkingSpots = listOfParkingSpots;
    }
}
