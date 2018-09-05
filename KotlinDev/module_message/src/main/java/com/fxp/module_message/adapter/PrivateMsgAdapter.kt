package com.fxp.module_message.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.fxp.module_message.R
import com.fxp.module_message.model.PrivateMsgModel

class PrivateMsgAdapter(context: Context?, list: MutableList<PrivateMsgModel>) : RecyclerView.Adapter<PrivateMsgAdapter.PrivateMsgHolder>() {

    private var context: Context? = null

    private var list: MutableList<PrivateMsgModel>? = null

    init{
        this.context = context
        this.list = list
    }

    override fun getItemCount(): Int {
        return list?.size ?:0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrivateMsgHolder{
        var view: View = LayoutInflater.from(context).inflate(R.layout.item_private_msg_list, parent, false)
        return PrivateMsgHolder(view)
    }

    override fun onBindViewHolder(holder: PrivateMsgHolder, position: Int) {
        holder?.userPhotoImageView?.setImageResource(R.mipmap.img_onepiece)
        holder?.userNameTxt?.text = list?.get(position)!!.userName
        holder?.lastMsgTimeTxt?.text = list?.get(position)!!.msgTime
        holder?.lastMsgContentTxt?.text = list?.get(position)!!.msgContent
        holder?.unreadMsgCount?.text = list?.get(position)!!.msgCount
    }

    inner class PrivateMsgHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var userPhotoImageView: ImageView = itemView?.findViewById(R.id.iv_user_photo) as ImageView
        var userNameTxt: TextView = itemView?.findViewById(R.id.tv_user_name) as TextView
        var lastMsgTimeTxt: TextView = itemView?.findViewById(R.id.tv_last_msg_time) as TextView
        var lastMsgContentTxt: TextView = itemView?.findViewById(R.id.tv_last_msg_content) as TextView
        var unreadMsgCount: TextView = itemView?.findViewById(R.id.tv_unread_msg_count) as TextView
    }
}