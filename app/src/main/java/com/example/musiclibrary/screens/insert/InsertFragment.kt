package com.example.musiclibrary.screens.insert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.musiclibrary.R
import com.example.musiclibrary.database.MusicDatabase
import com.example.musiclibrary.database.MusicRecord
import com.example.musiclibrary.databinding.FragmentInsertBinding
import com.google.android.material.snackbar.Snackbar

class InsertFragment: Fragment() {

    private lateinit var viewModel: InsertViewModel
    private lateinit var viewModelFactory: InsertViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentInsertBinding = FragmentInsertBinding.inflate(inflater,container, false)

        // Application context
        val application = requireNotNull(this.activity).application

        // Reference to the DAO of the database
        val dataSource = MusicDatabase.getInstance(application).musicDatabaseDao

        // Get the factory
        viewModelFactory = InsertViewModelFactory(dataSource)

        // Reference to the viewModel
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(InsertViewModel::class.java)

        binding.addButton.setOnClickListener {
            if(binding.songInput.text.isNotEmpty()) {

                val newRecord = MusicRecord()

                newRecord.albumName = if (binding.albumInput.text.isNotEmpty()) binding.albumInput.text.toString()
                                    else R.string.unknown.toString()
                newRecord.artistName = if (binding.artistInput.text.isNotEmpty()) binding.artistInput.text.toString()
                                    else R.string.unknown.toString()
                newRecord.year = if (binding.yearInput.text.isNotEmpty()) binding.yearInput.text.toString()
                                    else R.string.unknown.toString()

                viewModel.onSaveRegister(newRecord)

                Snackbar.make(activity!!.findViewById<View>(android.R.id.content), "Saved Data", Snackbar.LENGTH_SHORT).show()

            } else {
                Snackbar.make(activity!!.findViewById<View>(android.R.id.content), "Song can't be empty", Snackbar.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    private fun saveSong() {

    }
}