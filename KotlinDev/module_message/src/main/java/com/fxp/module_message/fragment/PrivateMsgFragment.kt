package com.fxp.module_message.fragment

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fxp.module_message.R
import com.fxp.module_message.adapter.PrivateMsgAdapter
import com.fxp.module_message.model.PrivateMsgModel

class PrivateMsgFragment: Fragment() {

    private val TAG: String = "PrivateMsgFragment"

    private var mainView: View? = null

    private lateinit var privateMsgRecyclerView: RecyclerView

    private lateinit var privateMsgAdapter: PrivateMsgAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mainView ?: let {
            mainView = inflater.inflate(R.layout.fragment_private_msg, container, false)
        }
        return mainView
    }


    override fun onInflate(activity: Activity?, attrs: AttributeSet?, savedInstanceState: Bundle?) {
        super.onInflate(activity, attrs, savedInstanceState)
        println("PrivateMsgFragment onInflate")
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        println("PrivateMsgFragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("PrivateMsgFragment onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("PrivateMsgFragment onViewCreated")

        privateMsgRecyclerView = mainView!!.findViewById(R.id.private_msg_recyclerView) as RecyclerView
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        privateMsgRecyclerView.layoutManager = layoutManager

        privateMsgAdapter = PrivateMsgAdapter(context, getPrivateMsgData())
        privateMsgRecyclerView.adapter = privateMsgAdapter
    }

    fun getPrivateMsgData():MutableList<PrivateMsgModel>{
        var privateMsgList: MutableList<PrivateMsgModel> = mutableListOf()
        for (i in 1..10){
            var privateMsg: PrivateMsgModel? = PrivateMsgModel()
            privateMsg!!.msgContent = "123"
            privateMsgList.add(privateMsg)
        }
        return privateMsgList
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("PrivateMsgFragment onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        println("PrivateMsgFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        println("PrivateMsgFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        println("PrivateMsgFragment onPause")
    }

    override fun onStop() {
        super.onStop()
        println("PrivateMsgFragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("PrivateMsgFragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("PrivateMsgFragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("PrivateMsgFragment onDetach")
    }

}