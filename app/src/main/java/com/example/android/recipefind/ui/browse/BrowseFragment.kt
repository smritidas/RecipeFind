package com.example.android.recipefind.ui.browse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout.VERTICAL
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.recipefind.R
import com.example.android.recipefind.ui.adapter.RecipeAdapter


class BrowseFragment : Fragment() {

    //Call the buttons here?

    // 1. make a call to the viewmodel, adapter and listView
    private val viewModel: BrowseViewModel by viewModel
    private val adapter: RecyclerView.Adapter
    private val listView: RecyclerView

//     2. call the viewmodel and

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) {

        // setup views by making a call to list
        listView = view.findViewById()

        // instantiate with empty list
        adapter = RecipeAdapter(listOf())

        listView.layoutManager = LinearLayoutManager(VERTICAL)
        listView.adapter = adapter


        //Set observer on viewmodel, do something each time the observer updates
        viewModel.uiState.observe(viewLifecycleOwner, Observer {state ->
            UIState.SUCCESS -> updateView(state.list)
            UIState.ERROR -> Toast.makeText("error").show()
            )

        }

                private fun updateView(list: List<String>) {
            //Send new data to adapter and re-render
            adapter.swapNewData(list)
            adapter.notifyDatasetChanged
        })



        }}