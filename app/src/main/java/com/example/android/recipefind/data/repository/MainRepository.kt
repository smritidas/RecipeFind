package com.example.android.recipefind.data.repository

import com.example.android.recipefind.data.api.ApiHelper
import com.example.android.recipefind.data.model.Recipe
import retrofit2.Response

//TODO update for recipe api service to replace api helper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getRecipes(): Response<List<Recipe>> {
        return apiHelper.getRecipes()
    }
}