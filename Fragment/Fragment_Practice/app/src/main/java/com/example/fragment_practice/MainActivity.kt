package com.example.fragment_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var a:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = findViewById(R.id.bottom_navigation)
        a.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.action_one -> true
                R.id.action_two -> true
                R.id.action_three -> true
            }
            false
        }
    }
}
