package com.example.yangxiaochun.myandroidproject.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.yangxiaochun.myandroidproject.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpDemoActivity extends AppCompatActivity {

    private TextView tvText;
    private String TAG="OkHttpDemoActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp_demo);
        //initView();
        initNetWork();
    }

    private void initNetWork() {
        String url="http://www.baidu.com";
        OkHttpClient okHttpClient=new OkHttpClient();
        final Request request=new Request.Builder()
                .url("http://www.baidu.com")
                .get()
                .build();
        Call call =okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.v(TAG,"failed");
                //tvText.setText("failed");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //tvText.setText("success");
                Log.v(TAG,"success");

            }
        });
    }

    private void initView() {
        tvText=findViewById(R.id.test);
    }
}
