package com.example.android.recipefind.ui.browse

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.recipefind.data.api.RecipeApiService
import com.example.android.recipefind.data.api.RetrofitClient
import kotlinx.coroutines.launch
import kotlin.reflect.KProperty

/**
 * Viewmodels don't contain references to the view
 *
 */

class BrowseViewModel : ViewModel() {
//retrofit gets called here
    //KTX co routine run time. Lifecycle viewmodel
    //Coroutine view model
    //error handling needs to be done here in MAIN REPO

    // TODO The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<String>()

    // TODO The external immutable LiveData for the request status
    val status: LiveData<String> = _status

    private fun getRecipes() {
        viewModelScope.launch{
            try {
                val listResult = RetrofitClient.recipesApi.getRecipe()
                _status.value = "Success! {${listResult.isSuccessful}}"
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
            }
        }
    }
}