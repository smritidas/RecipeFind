package com.example.android.recipefind.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//Class that describes a database table when working with room

@Entity(tableName = "saved_table")
class RecipeSaved (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val pictureUrl : String,
    val website: String,
    val url: String
)