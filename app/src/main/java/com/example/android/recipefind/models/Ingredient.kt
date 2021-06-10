package com.example.android.recipefind.models

data class Ingredient(val text: String,
                      val quantity: Long,
                      val measure: String,
                      val food: String,
                      val weight: Long,

                     // @Json(name = "foodId")
                      val foodID: String)
