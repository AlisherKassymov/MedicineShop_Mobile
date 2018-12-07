package com.example.alisher.medicineshop.entities;

public class Pharmacies {
    private int pharmId;

    private String pharmName;

    private String workHours;

    private String location;

    private String phoneNumber;

    private String description;

    public Pharmacies(int pharmId, String pharmName, String workHours, String location, String phoneNumber, String description) {
        this.pharmId = pharmId;
        this.pharmName = pharmName;
        this.workHours = workHours;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public Pharmacies() {

    }

    public int getPharmId() {
        return pharmId;
    }

    public String getPharmName() {
        return pharmName;
    }

    public String getWorkHours() {
        return workHours;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pharmacies{" +
                "pharmId=" + pharmId +
                ", pharmName='" + pharmName + '\'' +
                ", workHours='" + workHours + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
