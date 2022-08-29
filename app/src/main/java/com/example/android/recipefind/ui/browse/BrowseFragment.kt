package com.example.android.recipefind.ui.browse

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.LinearLayout.VERTICAL
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.recipefind.R
import com.example.android.recipefind.ui.adapter.RecipeAdapter


class BrowseFragment : Fragment() {

    //Call the buttons here?

    // 1. make a call to the viewmodel, adapter and listView
    private val viewModel: BrowseViewModel by viewModels()
    private lateinit var adapter: RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>
    private lateinit var listView: RecyclerView

//     2. call the viewmodel and

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = LayoutInflater.inflate(R.layout.fragment_browse,context, false)

        //TODO check the right recyclerview is being called
        listView = (view?.findViewById() ?: R.id.recyclerView) as RecyclerView

        // instantiate with empty list
        val adapter = RecipeAdapter(listOf())

        listView.layoutManager = LinearLayoutManager(this)
        listView.orientation = LinearLayoutManager.VERTICAL

        listView.adapter = adapter


        //Set observer on viewmodel, do something each time the observer updates
        viewModel.State.observe(viewLifecycleOwner, Observer { State ->
            State.Success -> updateView(state.list)
            State.Error -> Toast.makeText("error").show()
        })

        return view

    }


}

