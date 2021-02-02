package com.example.messengerapp

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.recive_message_layout.view.*

data class RecivedMessages(val message : String, val person : String): Item<GroupieViewHolder>(){
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.recived_message_text.text  = message
        viewHolder.itemView.from_who.text  = person

    }

    override fun getLayout(): Int  = R.layout.recive_message_layout

}