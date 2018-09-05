package com.fxp.module_message.fragment

import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.fxp.module_message.R
import com.fxp.module_message.adapter.PrivateMsgAdapter
import com.fxp.module_message.model.PrivateMsgModel

class PrivateMsgFragment : BaseFragment(), SwipeRefreshLayout.OnRefreshListener {

    private var swipeRefreshLayout:SwipeRefreshLayout? = null

    private lateinit var privateMsgRecyclerView: RecyclerView

    private lateinit var privateMsgAdapter: PrivateMsgAdapter

    override fun setFragmentTag(): String = "PrivateMsgFragment"

    override fun setLayoutId(): Int = R.layout.fragment_private_msg

    override fun findView() {
        privateMsgRecyclerView = mainView!!.findViewById(R.id.private_msg_recyclerView) as RecyclerView
        swipeRefreshLayout = mainView!!.findViewById(R.id.private_msg_srl) as SwipeRefreshLayout
    }

    override fun initData() {

    }

    override fun initView() {
        initPrivateMsgRecyclerView()
    }

    override fun initListener() {
        swipeRefreshLayout!!.setOnRefreshListener(this)
    }

    fun initPrivateMsgRecyclerView(){
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        privateMsgRecyclerView.layoutManager = layoutManager
        privateMsgAdapter = PrivateMsgAdapter(context, getPrivateMsgData())
        privateMsgRecyclerView.adapter = privateMsgAdapter
    }

    fun getPrivateMsgData():MutableList<PrivateMsgModel>{
        var privateMsgList: MutableList<PrivateMsgModel> = mutableListOf()
        for (i in 1..50){
            var privateMsg: PrivateMsgModel? = PrivateMsgModel()
            privateMsg!!.msgContent = "123"
            privateMsgList.add(privateMsg)
        }
        return privateMsgList
    }

    override fun onRefresh() {
        Thread.sleep(1500)
        swipeRefreshLayout!!.setRefreshing(false)
    }

}