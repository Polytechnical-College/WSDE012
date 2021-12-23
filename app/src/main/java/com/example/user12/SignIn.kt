package com.example.user12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }


    fun opnSU(view : View){

        val opnSU = Intent(this, SignUp::class.java)
        startActivity(opnSU)
        finish()

    }

    fun opnSS(view : View){

        var login = findViewById<EditText>(R.id.login)
        var pass = findViewById<EditText>(R.id.pass)

        if ((login.length() != 0) and (pass.length() != 0)){

            val opnSS = Intent(this, Navigate::class.java)
            startActivity(opnSS)
            finish()

        } else {
            if (login.length() == 0){
                login.error = "Введите логин"
            }

            if (pass.length() == 0){
                pass.error = "Введите пароль"
            }
        }



    }


}