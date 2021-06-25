package com.example.android.recipefind

import android.os.Build

class Constants {

    val APP_KEY: String = BuildConfig.APP_KEY
    val APP_ID: String = BuildConfig.APP_ID

    val RECIPES_BASE_URL = "https://api.edamam.com"
    val QUERY_PARAMETER = "q"
    val KEY_QUERY_PARAMETER = "app_key"
    val APP_QUERY_PARAMETER = "app_id"
}