package com.example.lol

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val champList:ArrayList<data>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val vv=LayoutInflater.from(parent.context).inflate(R.layout.list_row,parent,false)
        return  ViewHolder(vv)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val data:data=champList[position]
        holder.champ_Name.text=data.name
        holder.champ_img.setImageResource(data.img)
    }

    override fun getItemCount(): Int {
      return  champList.size
    }
    class ViewHolder(itemV:View,champ_img:ImageView?=null):RecyclerView.ViewHolder(itemV){
        init {
            champ_img?.setOnClickListener{
            }
        }

        val champ_Name = itemV.findViewById(R.id.name) as TextView
        val champ_img =itemV.findViewById(R.id.champ_img)as ImageView
    }


}