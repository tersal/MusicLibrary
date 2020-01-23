package com.example.musiclibrary.screens.insert

import androidx.lifecycle.ViewModel
import com.example.musiclibrary.database.MusicDatabaseDao
import com.example.musiclibrary.database.MusicRecord
import kotlinx.coroutines.*

class InsertViewModel(val database: MusicDatabaseDao): ViewModel() {

        private var viewModelJob = Job()
        private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

        private suspend fun insert(record: MusicRecord) {
                withContext(Dispatchers.IO) {
                        database.insert(record)
                }
        }

        fun onSaveRegister(record: MusicRecord) {
                uiScope.launch {
                        insert(record)
                }
        }
}