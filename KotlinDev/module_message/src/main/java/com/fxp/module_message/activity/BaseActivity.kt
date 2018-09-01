package com.fxp.module_message.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.fxp.module_message.R
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())

        findView()

        initData()

        initView()

        initListener()

        left_btn.setOnClickListener(this)
        right_btn.setOnClickListener(this)
    }

    protected abstract fun setLayoutId(): Int

    protected abstract fun findView()

    protected abstract fun initData()

    protected abstract fun initView()

    protected abstract fun initListener()

    protected abstract fun clickLeftBtn()

    protected abstract fun clickRightBtn()

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.left_btn ->{
                clickLeftBtn()
            }
            R.id.right_btn ->{
                clickRightBtn()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        clickLeftBtn()
    }

    fun setTopTitle(titleStr: String?){
        middle_title.text = titleStr
    }
}