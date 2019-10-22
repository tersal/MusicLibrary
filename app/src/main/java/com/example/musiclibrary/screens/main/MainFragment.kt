package com.example.musiclibrary.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.musiclibrary.R
import com.example.musiclibrary.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)

        return binding.root
    }
}