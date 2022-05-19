package com.tunanh.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class chuyendoi extends AppCompatActivity {
private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_2=(Button) findViewById(R.id.bt2);
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_3=(Button) findViewById(R.id.bt3);
        bt_4=(Button) findViewById(R.id.bt4);
    }
}
