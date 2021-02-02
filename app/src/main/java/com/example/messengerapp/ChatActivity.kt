package com.example.messengerapp

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.recive_message_layout.view.*
import kotlinx.android.synthetic.main.send_message_layout.view.*

class ChatActivity : AppCompatActivity() {
    private lateinit var dataBase : DatabaseReference
    private lateinit var mAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        supportActionBar?.title = "Chat"

        mAuth = FirebaseAuth.getInstance()


        dataBase = FirebaseDatabase.getInstance().getReference("PersonInfo")

        val adapter = GroupieAdapter()

        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))
        adapter.add(RecivedMessages("blaaaaablaaaa\n blaaaaa","ვიღაცა"))
        adapter.add(SentMessages("blaaaaablaaaa\n blaaaaa","მე"))




        message_recyclerView.adapter = adapter






    }
    override fun onCreateOptionsMenu( menu : Menu?) :Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){

            R.id.log_out->{
                startActivity(Intent(this, MainActivity::class.java))
                mAuth.signOut()
                finish()
            }

            R.id.user_page -> {
                startActivity(Intent(this, User_Page::class.java))
            }

            R.id.user_List ->{
                startActivity(Intent(this,UsersList::class.java))
            }

        }
        return super.onOptionsItemSelected(item)
    }
}


