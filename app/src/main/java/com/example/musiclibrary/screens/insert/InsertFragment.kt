package com.example.musiclibrary.screens.insert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.musiclibrary.R
import com.example.musiclibrary.databinding.FragmentInsertBinding

class InsertFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentInsertBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_insert, container, false)

        return binding.root
    }
}