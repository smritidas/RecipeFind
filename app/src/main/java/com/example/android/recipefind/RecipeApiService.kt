package com.example.android.recipefind

import com.example.android.recipefind.BuildConfig.APP_ID
import com.example.android.recipefind.models.Recipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface RecipeApiService {
    @GET("/search/?app_id=" + Constants.APP_ID + "&app_key=" + Constants.APP_KEY)
    suspend fun getRecipe(): List<Recipe>
}