package com.fxp.module_message.fragment

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment: Fragment() {

    var TAG: String? = null

    var mainView: View? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mainView ?: let {
            mainView = inflater.inflate(setLayoutId(), container, false)
        }
        return mainView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(TAG + " --> onViewCreated")

        findView()

        initData()

        initView()

        initListener()
    }

    protected abstract fun setFragmentTag(): String

    protected abstract fun setLayoutId(): Int

    protected abstract fun findView()

    protected abstract fun initData()

    protected abstract fun initView()

    protected abstract fun initListener()

    override fun onInflate(activity: Activity?, attrs: AttributeSet?, savedInstanceState: Bundle?) {
        super.onInflate(activity, attrs, savedInstanceState)
        println(TAG + " --> onInflate")
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        TAG = setFragmentTag()
        println(TAG + " --> onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(TAG + " --> onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println(TAG + " --> onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        println(TAG + " --> onStart")
    }

    override fun onResume() {
        super.onResume()
        println(TAG + " --> onResume")
    }

    override fun onPause() {
        super.onPause()
        println(TAG + " --> onPause")
    }

    override fun onStop() {
        super.onStop()
        println(TAG + " --> onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println(TAG + " --> onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        println(TAG + " --> onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println(TAG + " --> onDetach")
    }
}