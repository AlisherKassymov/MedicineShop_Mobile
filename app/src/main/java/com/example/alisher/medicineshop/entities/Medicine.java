package com.example.alisher.medicineshop.entities;

public class Medicine {
    private int medicalID;

    private String medicalName;

    private String price;

    private String description;

    public Medicine(int medicalID, String medicalName, String price, String description) {
        this.medicalID = medicalID;
        this.medicalName = medicalName;
        this.price = price;
        this.description = description;
    }

    public Medicine() {

    }

    public int getMedicalID() {
        return medicalID;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicalID=" + medicalID +
                ", medicalName='" + medicalName + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
