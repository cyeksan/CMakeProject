package com.example.cmakeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object{
        init {
            System.loadLibrary("native-lib")
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstKey = getApiKey(1)
        val secondKey = getApiKey(2)

        Log.i("CMakeTutorialResults", firstKey)
        Log.i("CMakeTutorialResults", secondKey)

    }

    private external fun getApiKey(id: Int): String
}