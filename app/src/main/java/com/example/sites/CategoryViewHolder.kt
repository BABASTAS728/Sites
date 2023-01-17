package com.example.sites

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun onBind(category: UnionType.Category){
        val name = itemView.findViewById<TextView>(R.id.category)
        name.text = category.category
    }
}