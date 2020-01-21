package com.example.musiclibrary.screens.insert

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.musiclibrary.database.MusicDatabaseDao

class InsertViewModel(val database: MusicDatabaseDao): ViewModel() {

        @Suppress("UNUSED_PARAMETER")
        fun onSaveRegister(artist: String, song: String, album: String, year: Int) {

        }
}