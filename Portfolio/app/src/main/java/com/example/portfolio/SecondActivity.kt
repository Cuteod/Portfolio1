package com.example.portfolio

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    private lateinit var text : Portlist


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        var intent = intent
        val aTitle = intent.getStringExtra("Title")
        val aImageView = intent.getIntExtra("Imageview", 0)

        actionBar.setTitle(aTitle)
        text1.text = aTitle
        image1.setImageResource(aImageView)


    }
}
