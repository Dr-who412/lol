package com.example.lol

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var rcview: RecyclerView
class MainActivity : AppCompatActivity() {
    val champ = ArrayList<data>()
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcview=findViewById(R.id.myrcview)

        champ.add(data("Aphelios",R.drawable.aphl))
        champ.add(data("Ashe",R.drawable.ashe))
        champ.add(data("teamo",R.drawable.temoo))
        champ.add(data("Evelynn",R.drawable.evelynn))
        champ.add(data("Fiora",R.drawable.fiora))
        champ.add(data("Kennan",R.drawable.kennan))
        champ.add(data("malzahar",R.drawable.malzahar))
        champ.add(data("mlphite",R.drawable.mlph))
        rcview.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val adapter=CustomAdapter(champ)
        rcview.adapter=adapter


    }
}