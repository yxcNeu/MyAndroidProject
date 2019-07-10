package com.example.yangxiaochun.myandroidproject.data

import android.util.Log

data class Coder(var name: String,
                 var age: Int) {
    companion object {
        const val TAG: String = "USER"
    }

    init {
        Log.v(TAG,name)
        println("$TAG  $name")
    }
    fun printInfo(){
        println("$name")
    }

}