package com.jtmcompany.mvp_exampleapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.jtmcompany.mvp_exampleapp.Presenter.MainContract;
import com.jtmcompany.mvp_exampleapp.Presenter.MainPresenter;
import com.jtmcompany.mvp_exampleapp.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {
MainContract.Presenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter=new MainPresenter(this);

        initListener();

    }


    private void initListener(){

        findViewById(R.id.result_bt).setOnClickListener(new View.OnClickListener() {
            //이벤트 발생-> Presenter에 이벤트 전달
            @Override
            public void onClick(View view) {
                final String inputA=((EditText)findViewById(R.id.num1)).getText().toString();
                final String inputB=((EditText)findViewById(R.id.num2)).getText().toString();
                mainPresenter.addNums(Integer.parseInt(inputA),Integer.parseInt(inputB));

            }
        });

    }

    @Override
    public void showResult(int result) {
        ((TextView)findViewById(R.id.result_tv)).setText(Integer.toString(result));
    }
}
