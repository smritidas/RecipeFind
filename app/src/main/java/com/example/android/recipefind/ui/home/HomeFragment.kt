package com.example.android.recipefind.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.recipefind.R

//TODO code up the buttons to point to other fragments
//TODO Splash screen

class HomeFragment : Fragment(), View.OnClickListener{

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        //TODO ask about this code?
        val textView: TextView? = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView?.text = it

        })

        //TODO ViewBinding
        val browseButton = root.findViewById<Button>(R.id.tv_browse_ideas)
        val searchButton = root.findViewById<Button>(R.id.tv_ingredient_search)
        val bookmarksButton = root.findViewById<Button>(R.id.tv_saved_bookmarks)

        browseButton.setOnClickListener(this)
        searchButton.setOnClickListener(this)
        bookmarksButton.setOnClickListener(this)

        return root
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_browse_ideas -> {
                findNavController().navigate(R.id.action_homeFragment_to_navigation_browse)
            }
            R.id.tv_ingredient_search -> {
                findNavController().navigate(R.id.action_homeFragment_to_navigation_search)
            }
            R.id.tv_saved_bookmarks -> {
                findNavController().navigate(R.id.action_homeFragment_to_navigation_bookmarks)
            }
        }
    }

}