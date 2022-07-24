package com.muzaffar.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        var titleList = LinkedList<String>()
        var subtitleList = LinkedList<String>()

        for (i in 1..10){
            titleList.add("Title $i")
            subtitleList.add("This is subtitle $i")
        }

        var adapter = CustomAdapter();

        adapter.list = titleList;
        adapter.subtitleList = subtitleList
        recyclerView.adapter = adapter

    }
}