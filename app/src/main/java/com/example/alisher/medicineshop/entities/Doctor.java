package com.example.alisher.medicineshop.entities;

public class Doctor {
    private int doctorId;

    private String doctorName;

    private String doctorSurname;

    private String doctorExperience;

    private int docImage;

    private String doctorSpecification;

    private String doctorToClinic;

    private String doctorDescription;

    public Doctor(int doctorId, String doctorName, String doctorSurname, String doctorExperience, int docImage, String doctorSpecification, String doctorToClinic, String doctorDescription) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorExperience = doctorExperience;
        this.docImage = docImage;
        this.doctorSpecification = doctorSpecification;
        this.doctorToClinic = doctorToClinic;
        this.doctorDescription = doctorDescription;
    }

    public Doctor() {

    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public String getDoctorExperience() {
        return doctorExperience;
    }

    public int getDocImage() {
        return docImage;
    }

    public String getDoctorSpecification() {
        return doctorSpecification;
    }

    public String getDoctorToClinic() {
        return doctorToClinic;
    }

    public String getDoctorDescription() {
        return doctorDescription;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorSurname='" + doctorSurname + '\'' +
                ", doctorExperience='" + doctorExperience + '\'' +
                ", docImage=" + docImage +
                ", doctorSpecification='" + doctorSpecification + '\'' +
                ", doctorToClinic='" + doctorToClinic + '\'' +
                ", doctorDescription='" + doctorDescription + '\'' +
                '}';
    }
}
