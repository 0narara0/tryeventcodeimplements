package com.cmy.www.tryeventcodeimplements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnLongClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
//        if(v.getId()==R.id.btn1){
//            Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
//        }
        int id = v.getId();
        switch (id) {
            case R.id.btn1:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;


        }

    }

    @Override
    public boolean onLongClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn3:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }
}
