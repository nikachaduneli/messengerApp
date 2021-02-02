package com.example.messengerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xwray.groupie.GroupieAdapter
import kotlinx.android.synthetic.main.activity_users_list.*

class UsersList : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users_list)
        supportActionBar?.title = "User list"


        val adapter = GroupieAdapter()

        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_baseline_arrow_forward_24))

        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_baseline_arrow_forward_24))

        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_launcher_foreground))
        adapter.add(UserInfo("gujia", R.drawable.ic_baseline_arrow_forward_24))

        recyclerView.adapter = adapter




    }
}
