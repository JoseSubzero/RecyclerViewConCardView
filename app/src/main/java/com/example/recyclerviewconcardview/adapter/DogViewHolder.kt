package com.example.recyclerviewconcardview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewconcardview.Dogs
import com.example.recyclerviewconcardview.R
import com.example.recyclerviewconcardview.databinding.ItemDogBinding

class DogViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemDogBinding.bind(view)
    fun render(dogModel: Dogs){
        binding.tvDogRace.text = dogModel.raza
        binding.tvDogAge.text = dogModel.edad.toString()
        binding.tvDogName.text = dogModel.nombre
        binding.tvSterilized.text  = if (true){
            "Yes"
        } else{
            "No"
        }
        binding.tvChip.text  = if (true){
            "Yes"
        } else{
            "No"
        }
        binding.tvSex.text  = if (true){
            "Male"
        } else{
            "Female"
        }
        Glide.with(binding.ivDog.context)
            .load(dogModel.foto)
            .error(R.drawable.notfound_copia)
            .into(binding.ivDog)
        binding.ivDog.setOnClickListener {
            Toast.makeText(binding.ivDog.context, dogModel.nombre,Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(binding.ivDog.context, dogModel.raza, Toast.LENGTH_SHORT).show()

        }


    }
}