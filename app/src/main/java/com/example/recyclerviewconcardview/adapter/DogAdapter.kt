package com.example.recyclerviewconcardview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewconcardview.DogProvider.Companion.DogList
import com.example.recyclerviewconcardview.Dogs
import com.example.recyclerviewconcardview.R

class DogAdapter (private val dogList: List<Dogs>) : RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = DogList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = DogList.size
}