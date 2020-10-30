package com.mohammadazri.fragmentviewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Home_Adapter(var context:Context, cats:ArrayList<Cat>) : RecyclerView.Adapter<Home_Adapter.viewHolder>() {

    var cats:ArrayList<Cat>

    init {
        this.cats = cats
    }

    class viewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView
        val title:TextView

        init {
            image = itemView.findViewById(R.id.cat_image)
            title = itemView.findViewById(R.id.cat_title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layout:View
        layout = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false)

        return viewHolder(layout)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val itemData = cats[position]

        holder.image.setImageResource(itemData.image!!)
        holder.title.text = itemData.title
    }

    override fun getItemCount(): Int {
        return cats.size
    }
}