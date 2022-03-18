package com.example.android.recipefind.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        val textView: TextView? = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView?.text = it
        })
        return root
    }

    private fun navigateToBrowse(){
        findNavController().navigate(R.id.action_homeFragment_to_navigation_browse)
            //wire up on click
    }

    //button to navigate to ideas ie browse fragment

    //button to navigate to search fragment
    //button to navigate to bookmarks

}