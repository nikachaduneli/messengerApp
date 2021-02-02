package com.example.messengerapp

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.user_list_user_layout.view.*

data class UserInfo(val name:String, val image: Int): Item<GroupieViewHolder>(){
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
       viewHolder.itemView.user_username.text = name
       viewHolder.itemView.user_profilePicture.setImageResource(image)

    }

    override fun getLayout(): Int = R.layout.user_list_user_layout


}
