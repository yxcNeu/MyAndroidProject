package com.example.yangxiaochun.myandroidproject.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yangxiaochun.myandroidproject.R
import com.example.yangxiaochun.myandroidproject.dagger.DaggerMainComponent
import com.example.yangxiaochun.myandroidproject.dagger.UserModule
import com.example.yangxiaochun.myandroidproject.data.Coder
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var coder:Coder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)
        injection()
        coder.printInfo()
    }

    private fun injection() {
        DaggerMainComponent.builder().userModule(UserModule(this)).build().inject(this)
    }
}