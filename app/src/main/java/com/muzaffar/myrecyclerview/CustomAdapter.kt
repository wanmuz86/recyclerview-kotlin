package com.muzaffar.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.util.*

class CustomAdapter : Adapter<CustomAdapter.CustomViewHolder>() {

    var list = LinkedList<String>();
    var subtitleList = LinkedList<String>();

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTextView:TextView = itemView.findViewById(R.id.textTitle)
        var subTitleTextView:TextView = itemView.findViewById(R.id.subTitle)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val context = parent.context
        var inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.custom_row, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.titleTextView.text = list[position]
        holder.subTitleTextView.text = subtitleList[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

}