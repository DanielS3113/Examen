package com.example.examen;

import android.graphics.ColorSpace;

import java.util.List;

import Model.Model;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {
    @GET("digimon")
    Call<List<Model>>getDigimons();


}
