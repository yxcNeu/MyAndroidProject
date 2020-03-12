package com.example.yangxiaochun.myandroidproject.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.example.yangxiaochun.myandroidproject.R
import com.example.yangxiaochun.myandroidproject.dagger.DaggerMainComponent
import com.example.yangxiaochun.myandroidproject.dagger.UserModule
import com.example.yangxiaochun.myandroidproject.data.Coder
import org.json.JSONObject
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    companion object {
        const val TAG="DaggerActivity"
    }
    @Inject
    lateinit var coder:Coder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)
        injection()
        coder.printInfo()
    }

    private fun injection() {
        val testMap= hashMapOf( "subsource" to "subsource",
                "source" to "subsource")
        val map= hashMapOf("string" to "stringdata" ,"map to string" to JSONObject(testMap).toString(),
                "map no string" to testMap)
                //"json" to "[{\"SUB_SOURCE_CONTENT_RANK\":\"[1,2,3,4]\",\"SUB_SOURCE\":\"POPULAR_CUISINE\",\"SUB_SOURCE_RANK\":\"1\",\"FEED_SUB_TYPE\":\"SEARCH\",\"SUB_SOURCE_MAX_RANK_VIEWED\":\"4\",\"FEED_TYPE\":\"SEARCH\",\"SUB_SOURCE_CONTENT\":\"[1658,1649,2328,]\"}]")
        Log.v(TAG,JSONObject(map).toString())
        Log.v(TAG,JSONObject(testMap).toString())
        DaggerMainComponent.builder().userModule(UserModule(this)).build().inject(this)
    }
}