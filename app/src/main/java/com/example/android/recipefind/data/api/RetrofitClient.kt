package com.example.android.recipefind.data.api

import com.example.android.recipefind.Constants.RECIPES_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {

    val recipesApi: RecipeApiService by lazy {

        Retrofit.Builder()
                .baseUrl(RECIPES_BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(RecipeApiService::class.java)
    }
}