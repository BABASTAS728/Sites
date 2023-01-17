package com.example.sites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SiteCategoryAdapter(private val list: List<UnionType>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val SITE_TYPE = 1
        private const val CATEGORY_TYPE = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            SITE_TYPE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.site_layout, parent, false)
                SiteViewHolder(view)
            }
            CATEGORY_TYPE -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.category_layout, parent, false)
                CategoryViewHolder(view)
            }
            else -> throw Exception()
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SiteViewHolder -> holder.onBind(list[position] as UnionType.Site)
            is CategoryViewHolder -> holder.onBind(list[position] as UnionType.Category)
            else -> throw Exception()
        }
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int = when (list[position]) {
        is UnionType.Site -> SITE_TYPE
        is UnionType.Category -> CATEGORY_TYPE
        else -> throw Exception()
    }
}