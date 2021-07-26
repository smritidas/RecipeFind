package com.example.android.recipefind

import android.os.Build

object Constants {

    const val APP_KEY: String = BuildConfig.APP_KEY
    const val APP_ID: String = BuildConfig.APP_ID

    const val RECIPES_BASE_URL = "https://api.edamam.com"
    const val QUERY_PARAMETER = "q"
    const val KEY_QUERY_PARAMETER = "app_key"
    const val APP_QUERY_PARAMETER = "app_id"
}