package com.fxp.kotlindev

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test("1");
        test("2");
        test("3");

    }

    fun test(str : String){
        println(str);
    }
}
