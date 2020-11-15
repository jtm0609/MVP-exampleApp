package com.jtmcompany.mvp_exampleapp.Presenter;

import com.jtmcompany.mvp_exampleapp.Model.MainModel;

public class MainPresenter implements MainContract.Presenter{
    MainContract.View mainView;
    MainModel mainModel;

   public MainPresenter(MainContract.View view){
       //View연결
       mainView=view;

       //Model 연결
       mainModel=new MainModel(this);
   }

    //이벤트 전달에 대한 처리-> View로 데이터 전달
    @Override
    public void addNums(int input1, int input2) {
     mainView.showResult(input1+input2);
    }

    @Override
    public void saveData(int data) {
        mainModel.saveData(data);

    }
}
