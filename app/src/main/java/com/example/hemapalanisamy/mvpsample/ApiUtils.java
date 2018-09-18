package com.example.hemapalanisamy.mvpsample;

public class ApiUtils {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}