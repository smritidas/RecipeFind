package com.example.android.recipefind.models

data class Recipe(val uri: String,
                  val label: String,
                  val image: String,
                  val source: String,
                  val url: String,
                  val yield: Long,
                  val ingredientLines: List<String>,
                  val ingredients: List<Ingredient>,
                  val cuisineType: List<String>,
                  val mealType: List<String>,
                  val dishType: List<String>)