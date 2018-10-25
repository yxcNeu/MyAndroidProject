package com.example.yangxiaochun.myandroidproject;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yangxiaochun.myandroidproject.activity.FoldToolbarActivity;
import com.example.yangxiaochun.myandroidproject.activity.NavigationActivity;
import com.example.yangxiaochun.myandroidproject.databinding.ActivityMainBinding;
import com.example.yangxiaochun.myandroidproject.model.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button viewpager_but;
    private Button mNavigationBtn;
    private Button mFoldBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager_but=findViewById(R.id.viewpagerBut);
        viewpager_but.setOnClickListener(this);
        mNavigationBtn=findViewById(R.id.navigation);
        mNavigationBtn.setOnClickListener(this);
        mFoldBtn=findViewById(R.id.foldBtn);
        mFoldBtn.setOnClickListener(this);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user=new User("yang","xiaochun");
        binding.setUser(user);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.viewpagerBut:{
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ViewpagerActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.navigation: {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, NavigationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.foldBtn:{
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, FoldToolbarActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
