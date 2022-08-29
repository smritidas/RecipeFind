package com.example.android.recipefind.ui.browse

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.recipefind.data.api.RecipeApiService
import com.example.android.recipefind.data.api.RetrofitClient
import com.example.android.recipefind.data.repository.RecipeRepository
import kotlinx.coroutines.launch
import kotlin.reflect.KProperty


class BrowseViewModel : ViewModel() {


    // TODO The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<String>()

    // TODO The external immutable LiveData for the request status
    val status: LiveData<String> = _status
    //create ui state model in the viewmodel
    //create a sealed class

    private fun getRecipes() {
        viewModelScope.launch{
            try {
                val listResult = RetrofitClient.recipesApi.getRecipe("q")
                State.Success = "Success! {${listResult.isSuccessful}}"
            } catch (e: Exception) {
                State.Failure = "Failure: ${e.message}"
            }
        }
    }

    sealed class State {
        data class Success (val state: String)
        data class Failure (val state: String)
    }

}