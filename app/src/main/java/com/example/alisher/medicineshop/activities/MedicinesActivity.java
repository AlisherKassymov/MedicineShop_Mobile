package com.example.alisher.medicineshop.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.alisher.medicineshop.R;
import com.example.alisher.medicineshop.adapters.MedicineAdapter;
import com.example.alisher.medicineshop.decorator.SimpleDividerItemDecoration;
import com.example.alisher.medicineshop.entities.Medicine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MedicinesActivity extends AppCompatActivity{

    private String jsonURL="http://eaa77a8e.ngrok.io/api/medicine";
    private JsonArrayRequest ArrayRequest;
    private RequestQueue requestQueue;
    private List<Medicine> medicinesList=new ArrayList<>();
    private RecyclerView recyclerView;

    private DrawerLayout mDrawarLayout;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.medicine_activity);

        recyclerView=findViewById(R.id.medicineRecuclerView);
        loadDoctors();
    }

    private void loadDoctors(){
        StringRequest stringRequest=new StringRequest(Request.Method.GET, jsonURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray array = new JSONArray(response);
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject medinice = array.getJSONObject(i);

                        medicinesList.add(new Medicine(medinice.getString("name"),
                                medinice.getString("description"),
                                medinice.getString("price")));
                    }
                    setRvAdapter(medicinesList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        Volley.newRequestQueue(this).add(stringRequest);
    }

    /*public void jsonCall(){
        ArrayRequest=new JsonArrayRequest(jsonURL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;

                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);

                        Medicine medicine=new Medicine();

                        medicine.setName(jsonObject.getString("name"));
                        medicine.setDescription(jsonObject.getString("description"));
                        medicine.setPrice(jsonObject.getString("price"));

                        medicinesList.add(medicine);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                setRvAdapter(medicinesList);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue=Volley.newRequestQueue(MedicinesActivity.this);
        requestQueue.add(ArrayRequest);
    }*/

    public void setRvAdapter(List<Medicine> list){
        MedicineAdapter adapter=new MedicineAdapter(this,list);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
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
