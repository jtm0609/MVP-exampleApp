package com.jtmcompany.mvp_exampleapp.Model;

import com.jtmcompany.mvp_exampleapp.Presenter.MainContract;

public class MainModel {
    MainContract.Presenter presenter;

    public MainModel(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    //Presenter에서 데이터 저장시 호출딥니다.
    public void saveData(int data){

    }
}
