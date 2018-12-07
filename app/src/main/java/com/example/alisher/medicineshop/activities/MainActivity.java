package com.example.alisher.medicineshop.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.alisher.medicineshop.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDrawarLayout=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
                int id=menuItem.getItemId();

                switch (id){
                    case R.id.profile:
                        Toast.makeText(MainActivity.this, "Profile page", Toast.LENGTH_SHORT).show();
                    case R.id.medicines:
                        Intent intent2=new Intent(MainActivity.this,MedicinesActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.pharmacies:
                        Intent intent1=new Intent(MainActivity.this,PharmActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.doctors:
                        Intent intent=new Intent(MainActivity.this,DoctorActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.clinic:
                        Intent intent0=new Intent(MainActivity.this,ClinicActivity.class);
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
