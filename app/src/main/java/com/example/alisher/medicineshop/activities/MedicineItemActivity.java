package com.example.alisher.medicineshop.activities;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.request.RequestOptions;
import com.example.alisher.medicineshop.R;

public class MedicineItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_item);

        //hide
        getSupportActionBar().hide();

        //Receive data

        String name=getIntent().getExtras().getString("medicine_name");
        String description=getIntent().getExtras().getString("medicine_description");
        String price=getIntent().getExtras().getString("medicine_price");

        CollapsingToolbarLayout collapsingToolbarLayout=findViewById(R.id.medicineCollapsingtoolBar);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView med_name=findViewById(R.id.medicineItemName);
        TextView med_desc=findViewById(R.id.medicineItemDescription);
        TextView med_price=findViewById(R.id.medicineItemPrice);
        ImageView med_image=findViewById(R.id.medicineItemImage);

        med_name.setText(name);
        med_desc.setText(description);
        med_price.setText(price);

        collapsingToolbarLayout.setTitle(name);
    }
}
