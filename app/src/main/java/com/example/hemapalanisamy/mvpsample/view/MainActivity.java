package com.example.hemapalanisamy.mvpsample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hemapalanisamy.mvpsample.Pojo;
import com.example.hemapalanisamy.mvpsample.R;
import com.example.hemapalanisamy.mvpsample.presenter.MainPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainView  {

    private RecyclerView mRecyclerView;
    private MainPresenterImpl mainPresenter;
    private IMainView iMainView;
    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mainPresenter=new MainPresenterImpl(this);
        mainPresenter.dataAccessPresenterToModel();
    }


    @Override
    public void dataTransferPresenterToView(List<Pojo> response) {

        mAdapter = new MainAdapter(response);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);
    }
}

