package com.cmy.www.tryeventcodeimplements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
//        if(v.getId()==R.id.btn1){
//            Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
//        }
        int id = v.getId();
        switch (id) {
            case R.id.btn1:
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
                break;



        }

    }
}
