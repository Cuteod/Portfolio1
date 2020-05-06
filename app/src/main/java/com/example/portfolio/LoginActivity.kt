package com.example.portfolio

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up_.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun onLog(view: View) {
        val pref = getSharedPreferences(SignUp_Activity.SHARED_PREF,Context.MODE_PRIVATE)
        val Email = pref.getString(SignUp_Activity.EMAIL,"N/A")
        val Password = pref.getString(SignUp_Activity.PASSWORD,"N/A")

        if(Email.equals(EtEmail.text.toString()) && Password.equals(EtPassword.text.toString())){
            Toast.makeText(this,"Verified", Toast.LENGTH_LONG).show()
        }

    }

}
