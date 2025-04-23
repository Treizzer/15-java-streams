package com.treizer.ltc.exercise2;

public class Vehicle {

    private String carNumber;
    private Model model;
    private Integer kilometers;

    public Vehicle() {
    }

    public Vehicle(String carNumber, Model model, Integer kilometers) {
        this.carNumber = carNumber;
        this.model = model;
        this.kilometers = kilometers;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getKilometers() {
        return kilometers;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String toString() {
        return "Vehicle [carNumber=" + carNumber + ", model=" + model + ", kilometers=" + kilometers + "]";
    }

}
