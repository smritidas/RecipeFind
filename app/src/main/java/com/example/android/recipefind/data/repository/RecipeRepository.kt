package com.example.android.recipefind.data.repository

import com.example.android.recipefind.data.api.RecipeApiService

//TODO rename repository
class RecipeRepository(private val apiService: RecipeApiService) {

    suspend fun getRecipes() = apiService.getRecipe()
}