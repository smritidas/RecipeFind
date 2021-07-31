package com.example.android.recipefind.models

import com.google.gson.JsonObject
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//TODO should use (1) generateAdapter (2) serialized name?


    @JsonClass(generateAdapter = true)
    data class Hit (
            val recipe: Recipe,
            @Json(name = "_links")
            val links: Links
    )
    @JsonClass(generateAdapter = true)
    data class Links (
            val self: Next,
            val next: Next
    )
    @JsonClass(generateAdapter = true)
    data class Next (
            val href: String,
            val title: String
    )

    @JsonClass(generateAdapter = true)
    data class Recipe (
            val uri: String,
            val label: String,
            val image: String,
            val source: String,
            val url: String,
            val shareAs: String,
            val yield: Long,
            val dietLabels: List<String>,
            val healthLabels: List<String>,
            val cautions: List<String>,
            val ingredientLines: List<String>,
            val ingredients: List<Ingredient>,
            val calories: Long,
            val totalWeight: Long,
            val cuisineType: List<String>,
            val mealType: List<String>,
            val dishType: List<String>,
            val digest: List<Digest>
    )

    @JsonClass(generateAdapter = true)
    data class Digest (
            val label: String,
            val tag: String,
            val schemaOrgTag: String,
            val total: Long,
            val hasRDI: Boolean,
            val daily: Long,
            val unit: String,
    )

    @JsonClass(generateAdapter = true)
    data class Ingredient (
            val text: String,
            val quantity: Long,
            val measure: String,
            val food: String,
            val weight: Long,

            @Json(name = "foodId")
            val foodID: String
    )

