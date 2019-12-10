package com.example.fragment_practice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(SecondFragment())
        main_btn1.setOnClickListener {
            ReplaceFragment(FirstFragment())
        }
        main_btn2.setOnClickListener {
            ReplaceFragment(SecondFragment())
        }
        main_btn3.setOnClickListener {
            ReplaceFragment(ThirdFragment())
        }
    }

    fun addFragment(fragment:Fragment){
        val fm = supportFragmentManager
        val transaction =fm.beginTransaction()
        transaction.add(R.id.maincontainer,fragment)
        transaction.commit()
    }

    fun ReplaceFragment(fragment:Fragment){
        val fm = supportFragmentManager
        val transaction =fm.beginTransaction()
        transaction.replace(R.id.maincontainer,fragment)
        transaction.commit()
    }
}
