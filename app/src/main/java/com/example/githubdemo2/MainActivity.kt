package com.example.githubdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Test","This is commit1")
        Log.d("Test","This is commit2")
        Log.d("Test","This is commit3")
        Log.d("Test","Change in release branch 1")
    }
}