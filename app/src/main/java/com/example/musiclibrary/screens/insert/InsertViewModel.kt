package com.example.musiclibrary.screens.insert

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.musiclibrary.database.MusicDatabaseDao

class InsertViewModel(val database: MusicDatabaseDao, application: Application):
        AndroidViewModel(application) {
}