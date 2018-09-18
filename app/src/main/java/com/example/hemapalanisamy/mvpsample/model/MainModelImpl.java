package com.example.hemapalanisamy.mvpsample.model;

import android.util.Log;

import com.example.hemapalanisamy.mvpsample.ApiUtils;
import com.example.hemapalanisamy.mvpsample.Pojo;
import com.example.hemapalanisamy.mvpsample.SOService;
import com.example.hemapalanisamy.mvpsample.presenter.IMainPresenter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainModelImpl implements IMainModel {


    private final SOService mService;
    private final IMainPresenter iMainPresenter;

    public MainModelImpl(IMainPresenter iMainPresenter) {

        this.iMainPresenter = iMainPresenter;
        mService = ApiUtils.getSOService();
    }


    @Override
    public void loadDetails() {
        mService.getDetails().enqueue(new Callback<List<Pojo>>() {
            @Override
            public void onResponse(Call<List<Pojo>> call, Response<List<Pojo>> response) {
                List<Pojo> responseDetails = response.body();
                iMainPresenter.dataTransferFromModelToPresenter(responseDetails);
            }

            @Override
            public void onFailure(Call<List<Pojo>> call, Throwable t) {
                Log.e("MainActivity", "error loading from API");
            }
        });
    }
}
