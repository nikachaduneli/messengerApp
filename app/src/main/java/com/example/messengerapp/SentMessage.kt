package com.example.messengerapp

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.send_message_layout.view.*

data class SentMessages(val message : String, val person : String): Item<GroupieViewHolder>(){
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.sent_message_text.text  = message
        viewHolder.itemView.from_me.text  = person


    }

    override fun getLayout(): Int  = R.layout.send_message_layout

}