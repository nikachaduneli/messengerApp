package com.example.messengerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class User_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user__page)

        supportActionBar?.title = "My Page"

    }
}