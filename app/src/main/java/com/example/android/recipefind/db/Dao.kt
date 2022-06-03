package com.example.android.recipefind.db

import androidx.room.*
import androidx.room.Dao
import com.example.android.recipefind.data.model.Recipe

//Data access object - maps SQL functions to queries
//ASK should this use co-routines?
@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(recipe: RecipeSaved)

    @Update
    suspend fun update(recipe: RecipeSaved)

    @Delete
    suspend fun delete(recipe: RecipeSaved)

    @Query("DELETE FROM saved_table")
    suspend fun deleteAll()

    @Query("SELECT * from saved_table ORDER BY name ASC")
    fun getAlphabetizedRecipes(): List<Recipe>

}