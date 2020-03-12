package com.example.yangxiaochun.myandroidproject.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.yangxiaochun.myandroidproject.R;
import com.example.yangxiaochun.myandroidproject.util.DimenUtils;
import com.example.yangxiaochun.myandroidproject.view.ShadowDrawable;

public class ShadowActivity extends AppCompatActivity {

    private LinearLayout customDrawableShadow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shadow);
        customDrawableShadow=findViewById(R.id.customDrawableShadow);
        ShadowDrawable.setShadowDrawable(customDrawableShadow, DimenUtils.dp2px(getApplicationContext(),4.0f),R.color.shadowLight,DimenUtils.dp2px(getApplicationContext(),4.0f),DimenUtils.dp2px(getApplicationContext(),4.0f),DimenUtils.dp2px(getApplicationContext(),4.0f));
    }
}
