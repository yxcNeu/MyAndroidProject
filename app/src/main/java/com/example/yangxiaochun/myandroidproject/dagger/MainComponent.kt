package com.example.yangxiaochun.myandroidproject.dagger

import com.example.yangxiaochun.myandroidproject.kotlin.DaggerActivity
import dagger.Component

@Component(modules = arrayOf(UserModule::class))
interface MainComponent {
    fun inject(activity: DaggerActivity)
}