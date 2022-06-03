package com.example.android.recipefind.db

import androidx.lifecycle.LiveData
import com.example.android.recipefind.data.model.Recipe

class RecipeRepository(private val recipeDao: Dao) {

    //Queries
    val allRecipes: LiveData<List<Recipe>> = recipeDao.getAlphabetizedRecipes()

    val delete = recipeDao.deleteAll()

    suspend fun addRecipe(recipe: RecipeSaved){
        //What goes here?
    }

}