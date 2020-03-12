package com.example.yangxiaochun.myandroidproject.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

import com.example.yangxiaochun.myandroidproject.R;

/**
 * @author yangxiaochun @ Zhihu Inc.
 * @since 10-24-2018
 */
public class NavigationActivity extends AppCompatActivity{
    private DrawerLayout mDrawerLayout;
    private Toolbar mToolbar;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        mToolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawerLayout=findViewById(R.id.drawer_layout);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_launcher_foreground);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{
                mDrawerLayout.openDrawer(Gravity.START);
                break;
            }
            default:
                break;
        }
        return true;
    }
}
