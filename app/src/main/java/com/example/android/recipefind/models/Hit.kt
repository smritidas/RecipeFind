package com.example.android.recipefind.models

import android.opengl.Visibility
import com.google.gson.annotations.SerializedName

data class Hit (val recipe: Recipe,
                //TODO fix this annotation
               // @Json(name = "_links")
                val links: Links)