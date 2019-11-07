package com.example.musiclibrary.screens.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.musiclibrary.database.MusicDatabaseDao
import java.lang.IllegalArgumentException

/*
 * Boilerplate code for the Insert functionality.
 */
class InsertViewModelFactory(private val dataSource: MusicDatabaseDao, private val application: Application):
        ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(InsertViewModel::class.java)) {
            return InsertViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}