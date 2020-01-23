package com.example.musiclibrary.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.navigation.findNavController
import com.example.musiclibrary.databinding.FragmentMainBinding

class MainFragment: Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var viewModeFactory: FragmentFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment.
        val binding: FragmentMainBinding = FragmentMainBinding.inflate(
            inflater, container, false)

        // Add listener to add new element
        binding.addButton.setOnClickListener {
            it.findNavController().navigate(MainFragmentDirections.actionMainFragmentToInsertFragment())
        }

        return binding.root
    }
}