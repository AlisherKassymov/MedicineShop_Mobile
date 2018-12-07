package com.example.alisher.medicineshop.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alisher.medicineshop.R;
import com.example.alisher.medicineshop.entities.Pharmacies;

public class PharmActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.pharmacy_layout);

        ListView pharmView=(ListView) findViewById(R.id.pharmacy_view);

        Pharmacies [] pharmacies={
                new Pharmacies(1, "Pharm","24 hours","Furmanova-Gogola","87992342","The biggest pharmacy in the city"),
                new Pharmacies(2, "CureInc","24 hours","Raimbeka-24","5555555","The best pharmacy in the city"),
                new Pharmacies(3, "Hello Cure","9:00-22:00","Kablukova 56","2223333","Automated pharmacy")
        };

        ArrayAdapter<Pharmacies> pharmaciesArrayAdapter=new ArrayAdapter<Pharmacies>(this,android.R.layout.simple_list_item_1,pharmacies);
        pharmView.setAdapter(pharmaciesArrayAdapter);
    }
}
