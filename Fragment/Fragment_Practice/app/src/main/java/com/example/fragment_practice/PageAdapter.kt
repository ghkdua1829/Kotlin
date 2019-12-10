package com.example.fragment_practice

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PageAdapter(fm:FragmentManager) : FragmentStatePagerAdapter(fm) {

    private var fragments : ArrayList<Fragment> = ArrayList()    //ArrayList는 굳이 초기화안해줘도 된다!!

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    fun addItems(fragment : Fragment){
        fragments.add(fragment)
    }
}