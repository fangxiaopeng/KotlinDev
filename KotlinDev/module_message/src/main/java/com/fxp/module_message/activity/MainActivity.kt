package com.fxp.module_message.activity

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.fxp.module_message.R
import com.fxp.module_message.adapter.FragmentViewPagerAdapter
import com.fxp.module_message.fragment.PrivateMsgFragment

class MainActivity : BaseActivity() {

    var mainTab: TabLayout? = null

    var mainViewPager: ViewPager? = null

    var middleTitle: String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun findView() {
        mainTab = findViewById<TabLayout>(R.id.main_tab)
        mainViewPager = findViewById<ViewPager>(R.id.main_viewpager)
    }

    override fun initData() {
        middleTitle = "我的消息"
    }

    override fun initView() {
        setTopTitle(middleTitle)

        initTabLayout()

        initMainViewPager()
    }

    override fun initListener() {

    }

    override fun clickLeftBtn() {
        finish()
    }

    override fun clickRightBtn() {

    }

    fun initTabLayout(){
        mainTab!!.addTab(mainTab!!.newTab().setText("私信"))
        mainTab!!.addTab(mainTab!!.newTab().setText("评论"))
        mainTab!!.addTab(mainTab!!.newTab().setText("@我"))
        mainTab!!.addTab(mainTab!!.newTab().setText("通知"))
        mainTab!!.setupWithViewPager(mainViewPager)
    }

    fun initMainViewPager(){
        val adapter = FragmentViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PrivateMsgFragment(), "私信")
        adapter.addFragment(PrivateMsgFragment(), "评论")
        adapter.addFragment(PrivateMsgFragment(), "@我")
        adapter.addFragment(PrivateMsgFragment(), "通知")
        mainViewPager!!.setAdapter(adapter)
    }
}
