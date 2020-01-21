package com.example.musiclibrary.screens.insert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.musiclibrary.R
import com.example.musiclibrary.database.MusicDatabase
import com.example.musiclibrary.databinding.FragmentInsertBinding

class InsertFragment: Fragment() {

    private lateinit var viewModel: InsertViewModel
    private lateinit var viewModelFactory: InsertViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentInsertBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_insert, container, false)

        // Application context
        val application = requireNotNull(this.activity).application

        // Reference to the DAO of the database
        val dataSource = MusicDatabase.getInstance(application).musicDatabaseDao

        // Get the factory
        viewModelFactory = InsertViewModelFactory(dataSource)

        // Reference to the viewModel
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(InsertViewModel::class.java)

        return binding.root
    }
}