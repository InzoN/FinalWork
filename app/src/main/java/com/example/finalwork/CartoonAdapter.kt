package com.example.finalwork

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CartoonAdapter(private val cartoonList:List<Cartoon>): RecyclerView.Adapter<CartoonViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartoonViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.cartoon_list_item, parent, false)
        return CartoonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartoonViewHolder, position: Int) {
        val car = cartoonList[position]
        holder.bind(car)
    }

    override fun getItemCount(): Int {
        return cartoonList.size
    }

}

