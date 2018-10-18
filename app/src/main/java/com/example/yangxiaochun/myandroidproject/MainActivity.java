package com.example.yangxiaochun.myandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button viewpager_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager_but=findViewById(R.id.viewpagerBut);
        viewpager_but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.viewpagerBut:{
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ViewpagerActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
