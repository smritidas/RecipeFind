package com.example.android.recipefind.data.api

class ApiHelper(private val apiService: RecipeApiService) {

   suspend fun getRecipes() = apiService.getRecipe()
}