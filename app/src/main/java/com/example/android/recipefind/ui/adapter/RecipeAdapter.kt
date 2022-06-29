package com.example.android.recipefind.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.recipefind.R
import com.example.android.recipefind.data.model.Recipe

class RecipeAdapter(private val dataset: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>(){

    class RecipeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val recipeImageView: ImageView = view.findViewById(R.id.recipeImageView)
        val recipeName: TextView = view.findViewById(R.id.tv_recipeName)
        val websiteName: TextView = view.findViewById(R.id.tv_nameOfWebsite)
        val websiteUrl: TextView = view.findViewById(R.id.tv_urlOfWebsite)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.recipe_listitem_rv,
                parent,
                false)
        )

    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = dataset[position]
    }

    override fun getItemCount() = dataset.size

//update the list with new data?

}