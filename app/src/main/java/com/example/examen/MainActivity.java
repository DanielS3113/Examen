package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.List;

import Model.Model;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    private List<Model> digimons;
    private static String url = "https://digimon-api.vercel.app/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

