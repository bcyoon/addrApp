package com.study.itwise.addrapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.study.itwise.addrapp.yoon.YoonMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //윤병찬 화면 전환 버튼
        Button goingYoonBtn = (Button) this.findViewById(R.id.goingYoonBtn);
        goingYoonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentYoon = new Intent(getApplicationContext(), YoonMainActivity.class);
                startActivity(intentYoon);
                //setContentView(R.layout.activity_yoon_main);
            }
        });

    }




}
