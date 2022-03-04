package com.example.android.recipefind.data.repository

import com.example.android.recipefind.data.api.RecipeApiService


class MainRepository(private val apiService: RecipeApiService) {

    suspend fun getRecipes() = apiService.getRecipe()
}