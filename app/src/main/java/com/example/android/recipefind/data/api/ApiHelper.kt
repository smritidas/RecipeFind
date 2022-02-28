package com.example.android.recipefind.data.api


// TODO rename this
class ApiHelper(private val apiService: RecipeApiService) {

   suspend fun getRecipes() = apiService.getRecipe()
}