package com.example.alisher.medicineshop.entities;


public class Clinic {
    private int clinicID;

    private String clinicName;

    private String location;

    private String workingHours;

    private String type;


    private String website;

    private String phoneNumber;

    private String Services;

    public Clinic(int clinicID, String clinicName, String location, String workingHours, String type, String website, String phoneNumber, String services) {
        this.clinicID = clinicID;
        this.clinicName = clinicName;
        this.location = location;
        this.workingHours = workingHours;
        this.type = type;
        this.website = website;
        this.phoneNumber = phoneNumber;
        Services = services;
    }

    public Clinic() {

    }

    public int getClinicID() {
        return clinicID;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getLocation() {
        return location;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public String getType() {
        return type;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getServices() {
        return Services;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "clinicID=" + clinicID +
                ", clinicName='" + clinicName + '\'' +
                ", location='" + location + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", type='" + type + '\'' +
                ", website=" + website +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Services='" + Services + '\'' +
                '}';
    }
}
