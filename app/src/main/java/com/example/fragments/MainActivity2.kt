package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragments.ui.SampleFragment



const val TAG = "TAGS"

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "MainActivity onCreate: ")
        addFragment()
    }

    private fun addFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val sampleFragment = SampleFragment()
        fragmentTransaction.add(R.id.fragmentContainer, sampleFragment)
        fragmentTransaction.commit()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause: ")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onSTop: ")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity onDestroy: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity onReStart: ")
    }
}