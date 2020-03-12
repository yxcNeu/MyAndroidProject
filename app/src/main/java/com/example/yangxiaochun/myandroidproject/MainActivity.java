package com.example.yangxiaochun.myandroidproject;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yangxiaochun.myandroidproject.activity.FlowLayoutActivity;
import com.example.yangxiaochun.myandroidproject.activity.FoldToolbarActivity;
import com.example.yangxiaochun.myandroidproject.activity.NavigationActivity;
import com.example.yangxiaochun.myandroidproject.activity.OkHttpDemoActivity;
import com.example.yangxiaochun.myandroidproject.activity.ShadowActivity;
import com.example.yangxiaochun.myandroidproject.kotlin.DaggerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button viewpager_but;
    private Button mNavigationBtn;
    private Button mFoldBtn;
    private Button mOkHttpBtn;
    private Button mShadowBtn;
    private Button mFlexBtn;
    private Button mDaggerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager_but = findViewById(R.id.viewpagerBut);
        viewpager_but.setOnClickListener(this);

        mNavigationBtn = findViewById(R.id.navigation);
        mNavigationBtn.setOnClickListener(this);

        mFoldBtn = findViewById(R.id.foldBtn);
        mFoldBtn.setOnClickListener(this);

        mOkHttpBtn = findViewById(R.id.okHttpBtn);
        mOkHttpBtn.setOnClickListener(this);

        mShadowBtn = findViewById(R.id.shadowBtn);
        mShadowBtn.setOnClickListener(this);

        mFlexBtn = findViewById(R.id.flexBoxBtn);
        mFlexBtn.setOnClickListener(this);

        mDaggerBtn = findViewById(R.id.daggerBtn);
        mDaggerBtn.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.viewpagerBut: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ViewpagerActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.navigation: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NavigationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.foldBtn: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FoldToolbarActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.okHttpBtn: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, OkHttpDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.shadowBtn: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ShadowActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.flexBoxBtn: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FlowLayoutActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.daggerBtn: {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DaggerActivity.class);
                startActivity(intent);
                break;
            }
        }

    }
}
