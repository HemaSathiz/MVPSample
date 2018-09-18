package com.example.hemapalanisamy.mvpsample.presenter;

import com.example.hemapalanisamy.mvpsample.Pojo;
import com.example.hemapalanisamy.mvpsample.model.MainModelImpl;
import com.example.hemapalanisamy.mvpsample.view.IMainView;

import java.util.List;

public class MainPresenterImpl implements IMainPresenter {

    private IMainView iMainView ;
    private MainModelImpl mainModel;

    public MainPresenterImpl(IMainView iMainView){
        this.iMainView=iMainView;
        mainModel=new MainModelImpl(this);
    }

    @Override
    public void dataAccessPresenterToModel() {
        mainModel.loadDetails();
    }

    @Override
    public void dataTransferFromModelToPresenter(List<Pojo> response) {
        iMainView.dataTransferPresenterToView(response);
    }
}
