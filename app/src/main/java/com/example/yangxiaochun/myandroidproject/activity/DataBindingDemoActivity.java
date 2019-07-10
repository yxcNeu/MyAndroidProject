package com.example.yangxiaochun.myandroidproject.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.yangxiaochun.myandroidproject.R;
import com.example.yangxiaochun.myandroidproject.databinding.ActivityDatabindingDemoBinding;
import com.example.yangxiaochun.myandroidproject.model.User;

public class DataBindingDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDatabindingDemoBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_databinding_demo);
        User user=new User("yang","xiaochun");
        binding.setUser(user); }
}
