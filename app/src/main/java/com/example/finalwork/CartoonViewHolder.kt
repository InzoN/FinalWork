package com.example.finalwork

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CartoonViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

    private val cartoonImageView: ImageView = itemView.findViewById(R.id.cartoon_image_view)
    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)

    fun bind(cartoon: Cartoon) {
        cartoonImageView.setImageResource(cartoon.image)

        itemView.setOnClickListener {
            Toast.makeText(itemView.context, cartoon.name, Toast.LENGTH_SHORT).show()

        }


    }}

