package com.example.android.recipefind.data.repository

import com.example.android.recipefind.data.api.RecipeApiService

/*
Eventually ROOM logic will live here too
Add error handling logic
 */
class RecipeRepository(private val apiService: RecipeApiService) {

    suspend fun getRecipes() = apiService.getRecipe()
}