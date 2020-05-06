package com.example.portfolio

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up_.*
import kotlinx.android.synthetic.main.portlist.*

class SignUp_Activity : AppCompatActivity() {
    companion object{
        const val SHARED_PREF= "com.example.portfolio.SHARED_PREF"
        const val EMAIL = "EMAIL"
        const val PASSWORD = "PASSWORD"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_)
    }

    fun onSignUp(view: View) {
        val pref = getSharedPreferences(SHARED_PREF,Context.MODE_PRIVATE)
        val editor = pref.edit()

        editor.putString("NAME", EtName.text.toString())
        editor.putString("EMAIL", EtEmail.text.toString())
        editor.putString("PASSWORD", EtPassword.text.toString())
        editor.putString("CONFIRM PASSWORD", EtConfirm.text.toString())
        editor.apply()

        val toast = Toast.makeText(applicationContext, "Signed In", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP,0,140)
        toast.show()
    }

    fun onLogin(view: View) {

        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }

}
