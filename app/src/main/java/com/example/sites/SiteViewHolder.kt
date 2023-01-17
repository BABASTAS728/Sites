package com.example.sites

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class SiteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @SuppressLint("SetTextI18n")
    fun onBind(site: UnionType.Site) {
        val name = itemView.findViewById<TextView>(R.id.name)
        val image = itemView.findViewById<ImageView>(R.id.image)
        val link = itemView.findViewById<TextView>(R.id.link)

        name.text = site.name
        image.setImageDrawable(ContextCompat.getDrawable(itemView.context, site.image))
        link.text = "Link: ${site.link}"

        link.setOnClickListener {
            val address = Uri.parse(site.link)
            val openLinkIntent = Intent(Intent.ACTION_VIEW, address)
            link.context.startActivity(openLinkIntent)
        }
    }
}