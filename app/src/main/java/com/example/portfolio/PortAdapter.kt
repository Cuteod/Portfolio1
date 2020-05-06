package com.example.portfolio

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.portlist.view.*

class PortAdapter(
    val arrayList: ArrayList<Portlist>, val context: Context) :
    RecyclerView.Adapter<PortAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItem(Portlist: Portlist){
            itemView.text.text=Portlist.title
            itemView.image.setImageResource(Portlist.image)
            //itemView.text.text=SharedPreference.getString("EMAIL",toString())
            //itemView.text.text=SharedPreference.getString("PASSWORD",toString())
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.portlist, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(arrayList[position])


        holder.itemView.setOnClickListener{
            if (position == 0){
                Toast.makeText(context, "You clicked over Play Store", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(context, "You clicked over Github", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(context, "You clicked over Bitbucket", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(context, "You clicked over Facebook", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(context, "You clicked over Twitter", Toast.LENGTH_LONG).show()
            }
            if (position == 5){
                Toast.makeText(context, "You clicked over Instagram", Toast.LENGTH_LONG).show()
            }
            if (position == 6){
                Toast.makeText(context, "You clicked over Google Plus", Toast.LENGTH_LONG).show()
            }
            if (position == 7){
                Toast.makeText(context, "You clicked over Youtube", Toast.LENGTH_LONG).show()
            }
            if (position == 8){
                Toast.makeText(context, "You clicked over Dribbble", Toast.LENGTH_LONG).show()
            }
            if (position == 9){
                Toast.makeText(context, "You clicked over Linkedin", Toast.LENGTH_LONG).show()
            }
            if (position == 10){
                Toast.makeText(context, "You clicked over E-mail", Toast.LENGTH_LONG).show()
            }
            if (position == 11){
                Toast.makeText(context, "You clicked over Whatsapp", Toast.LENGTH_LONG).show()
            }
            if (position == 12) {
                Toast.makeText(context, "You clicked over Skype", Toast.LENGTH_LONG).show()
            }
            if (position == 13){
                Toast.makeText(context, "You clicked over Google", Toast.LENGTH_LONG).show()
            }
            if (position == 14){
                Toast.makeText(context, "You clicked over Android", Toast.LENGTH_LONG).show()
            }
            if (position == 15){
                Toast.makeText(context, "You clicked over Website", Toast.LENGTH_LONG).show()
            }
            val portlist = arrayList.get(position)
            var title : String = portlist.title
            var ImageView : Int = portlist.image

            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("Title", title)
            intent.putExtra("Imageview",ImageView)

            context.startActivity(intent)


        }
    }
}