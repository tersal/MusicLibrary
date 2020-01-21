package com.example.musiclibrary.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.musiclibrary.database.MusicDatabaseDao
import java.lang.IllegalArgumentException

/*
 * Boilerplate code for the Insert functionality.
 */
class MainViewModelFactory(private val datsource: MusicDatabaseDao):
        ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(datsource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}