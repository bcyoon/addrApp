package com.study.itwise.addrapp.com.study.itwise.addrapp.yoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.study.itwise.addrapp.R;

public class YoonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoon_main);
    }

    /**
     * 물리적 뒤로가기 버튼 이벤트
     */
    @Override
    public void onBackPressed(){
          finish(); //현재 액티비티 종료
    }
}
