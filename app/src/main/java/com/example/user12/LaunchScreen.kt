package com.example.user12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)


        val opnact = Intent(this, SignIn::class.java)
        Handler().postDelayed({
            startActivity(opnact)
            finish()
        }, 2000)
    }



}