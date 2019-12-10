package com.example.fragment_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Switch
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var a:BottomNavigationView
    var prevMenuItem:MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = findViewById(R.id.bottom_navigation)

        val pagerAdapter = PagerAdapter(supportFragmentManager)
        val pager = findViewById<ViewPager>(R.id.container)
        pager.adapter = pagerAdapter

        pager.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                if (prevMenuItem != null)
                    prevMenuItem?.setChecked(false);
                else
                    a.getMenu().getItem(0).setChecked(false);

                a.getMenu().getItem(position).setChecked(true);
                prevMenuItem = a.getMenu().getItem(position);
            }
        })

        a.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_one -> {true; pager.setCurrentItem(0)}
                R.id.action_two -> {true; pager.setCurrentItem(1)}
                R.id.action_three -> {true; pager.setCurrentItem(2)}
            }
            true
        }
    }
}
