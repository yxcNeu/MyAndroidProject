package com.example.yangxiaochun.myandroidproject.dagger

import android.support.v7.app.AppCompatActivity
import com.example.yangxiaochun.myandroidproject.data.Coder
import dagger.Module
import dagger.Provides

@Module
class UserModule(private val activity: AppCompatActivity) {
    @Provides
    fun provideUser() = Coder("yang", 23)
}