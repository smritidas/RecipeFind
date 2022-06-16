package com.example.android.recipefind.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.recipefind.data.api.RetrofitClient
import kotlinx.coroutines.launch


//TODO Remove success after BrowseViewModel works
class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    init {


//            viewModelScope.launch{
//                try {
//                    val listResult = RetrofitClient.recipesApi.getRecipe("q")
//                    Log.v("S" ,"Success! {${listResult.isSuccessful}}")
//                } catch (e: Exception) {
//                    Log.v("S","Failure: ${e.message}")
//                }
//            }

    }
}