package com.example.android.recipefind

import com.example.android.recipefind.Constants.RECIPES_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val api: RecipeApiService by lazy {

        Retrofit.Builder()
                .baseUrl(RECIPES_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RecipeApiService::class.java)
    }

    //TODO helper class?
}