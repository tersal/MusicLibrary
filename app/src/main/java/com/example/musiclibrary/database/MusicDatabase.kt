package com.example.musiclibrary.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MusicRecord::class], version = 1, exportSchema = false)
abstract class MusicDatabase : RoomDatabase() {

}