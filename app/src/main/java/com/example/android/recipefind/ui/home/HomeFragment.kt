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

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var browseButton : Button
    private lateinit var searchButton : Button
    private lateinit var bookmarksButton : Button

    private var homeFragment : HomeFragment? = null

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
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateToBrowse()
        navigateToSearch()
        navigateToBookmarks()
    }


    private fun navigateToBrowse(){
        browseButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_navigation_browse) }
    }

    private fun navigateToSearch(){
        searchButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_navigation_search) }
    }

    private fun navigateToBookmarks(){
        bookmarksButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_navigation_bookmarks) }
    }

}