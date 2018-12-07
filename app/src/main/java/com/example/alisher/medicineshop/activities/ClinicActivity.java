package com.example.alisher.medicineshop.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alisher.medicineshop.R;
import com.example.alisher.medicineshop.entities.Clinic;

public class ClinicActivity extends AppCompatActivity{


    private DrawerLayout mDrawarLayout;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.clinic_layout);

        ListView clinicView=(ListView) findViewById(R.id.clinicView);

        Clinic[] clinics={
                new Clinic(1,"Teeth clinic", "Zharokova-Manasa","10-18","teeth","teeth.com","532532","Lorem ipsum sapien etiam, nunc armet dolor atc."),
                new Clinic(2,"Head clinic", "Zharokova-Manasa","10-18","teeth","teeth.com","532532","Lorem ipsum sapien etiam, nunc armet dolor atc."),
                new Clinic(3,"Member clinic", "Zharokova-Manasa","10-18","teeth","teeth.com","532532","Lorem ipsum sapien etiam, nunc armet dolor atc.")

        };

        ArrayAdapter<Clinic> doctorAdapter=new ArrayAdapter<Clinic>(this,android.R.layout.simple_list_item_1,clinics);

        clinicView.setAdapter(doctorAdapter);

        mDrawarLayout=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
                int id=menuItem.getItemId();

                switch (id){
                    case R.id.profile:
                        Toast.makeText(ClinicActivity.this, "Profile page", Toast.LENGTH_SHORT).show();
                    case R.id.medicines:
                        Intent intent2=new Intent(ClinicActivity.this,MedicinesActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.pharmacies:
                        Intent intent1=new Intent(ClinicActivity.this,PharmActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.doctors:
                        Intent intent=new Intent(ClinicActivity.this,DoctorActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.clinic:
                        Intent intent0=new Intent(ClinicActivity.this,ClinicActivity.class);
                        startActivity(intent0);
                        break;
                }
                return false;
            }
        });

        mDrawarLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawarLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
