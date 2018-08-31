package com.fxp.module_message.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fxp.module_message.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

    }



}