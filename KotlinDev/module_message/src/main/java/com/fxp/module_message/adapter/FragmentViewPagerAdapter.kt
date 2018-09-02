package com.fxp.module_message.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class FragmentViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    var mFragments: MutableList<Fragment> = arrayListOf()

    var mFragmentTitles: MutableList<String> = arrayListOf()

    fun addFragment(fragment: Fragment, title: String){
        mFragments.add(fragment)
        mFragmentTitles.add(title)
    }

    override fun getItem(position: Int): Fragment = mFragments[position]

    override fun getCount(): Int = mFragments.size

    override fun getPageTitle(position: Int): CharSequence? = mFragmentTitles[position]
}