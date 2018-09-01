package com.fxp.module_message.activity

import android.os.Bundle
import com.fxp.module_message.R

class MainActivity : BaseActivity() {

    var middleTitle: String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun findView() {

    }

    override fun initData() {
        middleTitle = "我的消息"
    }

    override fun initView() {
        setTopTitle(middleTitle)

    }

    override fun initListener() {

    }

    override fun clickLeftBtn() {
        finish()
    }

    override fun clickRightBtn() {

    }

}
