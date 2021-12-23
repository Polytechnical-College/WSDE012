package com.example.user12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun signup(view : View){

        var login = findViewById<EditText>(R.id.login)
        var email = findViewById<EditText>(R.id.email)
        var pass = findViewById<EditText>(R.id.pass)
        var passtwo = findViewById<EditText>(R.id.passtwo)

        if ((email.text.toString().checkemail()) and
            (pass.length() != 0) and
            (login.length() != 0) and
            (passtwo.length() != 0) and
            (email.length() != 0) and
            (pass.text.toString() == passtwo.text.toString())){

            val opnSI = Intent(this, SignIn::class.java)
            startActivity(opnSI)
            finish()

        } else {

            if (email.length() == 0){
                email.error = "Введите e-mail"
            } else if (!(email.text.toString().checkemail())) {
                email.error = "Неверный формат почты"
            }

            if (login.length() == 0){
                login.error = "Введите логин"
            }

            if (pass.length() == 0){
                pass.error = "Введите пароль"
            }

            if (passtwo.length() == 0){
                passtwo.error = "Повторите пароль"
            }

            if (pass.text.toString() != passtwo.text.toString()){
                passtwo.error = "Пароли не совпадают"
            }

        }


    }

    fun String.checkemail() : Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

}