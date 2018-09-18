package com.example.hemapalanisamy.mvpsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SOService {

    @GET("/posts")
    Call<List<Pojo>> getDetails();


}