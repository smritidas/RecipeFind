package com.example.android.recipefind.data.api

import com.example.android.recipefind.Constants
import com.example.android.recipefind.data.model.Recipe
import retrofit2.Response
import retrofit2.http.GET


interface RecipeApiService {
    @GET("/search/?app_id=" + Constants.APP_ID + "&app_key=" + Constants.APP_KEY)
    suspend fun getRecipe(): Response<List<Recipe>>
}