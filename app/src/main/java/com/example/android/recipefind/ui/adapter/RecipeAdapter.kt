package com.example.android.recipefind.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.recipefind.R
import com.example.android.recipefind.data.model.Recipe

//Should I use diffUtils?
class RecipeAdapter : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>(){

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<Recipe>(){
        override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.recipe_listitem_rv,
                parent,
                false)
        )
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipePicked = differ.currentList[position]
            holder.itemView.apply {
               // Glide.with(this).load()
               //add all the views to be called
                //setOnItemClickListener

            }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

   private var onItemClickListener: ((Recipe) -> Unit)? = null

   fun setOnItemClickListener(listener: (Recipe) -> Unit){
       onItemClickListener = listener
   }
}