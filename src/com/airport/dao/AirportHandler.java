package com.airport.dao;

import com.airport.bean.Passengers;
import com.airport.bean.Planes;
import com.airport.bean.Staff;

import java.util.HashMap;
import java.util.Map;

public class AirportHandler {

    private Map<String, Planes> planesMap = new HashMap<>();
    private Map<String, Staff> staffMap = new HashMap<>();
    private Map<String, Passengers> passengersMap = new HashMap<>();

    public AirportHandler() {}

    public Map<String, Planes> getPlanesMap() { return this.planesMap; }
    public Map<String, Staff> getStaffMap() { return this.staffMap; }
    public Map<String, Passengers> getPassengersMap() { return this.passengersMap; }

    public Planes addPlane(Planes plane) { return null; }
    public Staff addStaff(Staff staff) { return null; }
    public Passengers addPassengers(Passengers passenger) { return null; }

    public Planes removePlane(Planes plane) { return plane; }
    public Staff removeStaff(Staff staff) { return staff; }
    public Passengers removePassengers(Passengers passengers) { return passengers; }

    public Planes findPlane(String id) { return null; }
    public Staff findStaff(String id) { return null; }
    public Passengers findPassengers(String id) { return null; }
}
