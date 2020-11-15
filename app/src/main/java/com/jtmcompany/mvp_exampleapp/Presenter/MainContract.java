package com.jtmcompany.mvp_exampleapp.Presenter;

public interface MainContract {
    interface View{
        //View에 계산한 결과를 표시
        void showResult(int result);
    }

    interface Presenter{
        //View에서 입력한 두수에 대한 덧셈
        void addNums(int input1, int input2);

        //데이터 저장
        void saveData(int data);
    }
}
