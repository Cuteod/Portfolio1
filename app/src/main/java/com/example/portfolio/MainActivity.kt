package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val LinearLayout = layoutInflater

        val arrayList = ArrayList<Portlist>()
        arrayList.add(Portlist("Play Store", R.drawable.playstore_logo))
        arrayList.add(Portlist("Github", R.drawable.github_logo))
        arrayList.add(Portlist("Bitbucket", R.drawable.bitbucket_logo))
        arrayList.add(Portlist("Facebook", R.drawable.facebook_logo))
        arrayList.add(Portlist("Twitter", R.drawable.twitter_logo))
        arrayList.add(Portlist("Instagram", R.drawable.instagram_logo))
        arrayList.add(Portlist("Google Plus", R.drawable.googleplus_logo))
        arrayList.add(Portlist("Youtube", R.drawable.youtube_icon))
        arrayList.add(Portlist("Dribbble", R.drawable.dribbble_icon))
        arrayList.add(Portlist("Linkedin", R.drawable.linkedin_logo))
        arrayList.add(Portlist("E-mail", R.drawable.ic_email))
        arrayList.add(Portlist("Whatsapp", R.drawable.whatsapp_icon))
        arrayList.add(Portlist("Skype", R.drawable.skype_logo))
        arrayList.add(Portlist("Google", R.drawable.google_icon))
        arrayList.add(Portlist("Android", R.drawable.ic_android))
        arrayList.add(Portlist("Website", R.drawable.website_logo))

        val portAdapter = PortAdapter(arrayList, this)
        recyclerView1.layoutManager = GridLayoutManager(this, 4)
        recyclerView1.adapter = portAdapter

    }
}
