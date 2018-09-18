package com.example.hemapalanisamy.mvpsample.presenter;

import com.example.hemapalanisamy.mvpsample.Pojo;

import java.util.List;

public interface IMainPresenter {

     void dataAccessPresenterToModel();

     void dataTransferFromModelToPresenter(List<Pojo> response);
}
