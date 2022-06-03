package com.example.android.recipefind.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [RecipeSaved::class], version = 1, exportSchema = false)
abstract class RecipeDb: RoomDatabase() {

    abstract fun recipeDao() : Dao

    companion object{
        private var INSTANCE: RecipeDb? = null

        fun getDatabase(context: Context): RecipeDb {
           val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecipeDb::class.java,
                    "recipe_database"
                ).build()
                INSTANCE = instance
                return instance
            }

        }
    }
}