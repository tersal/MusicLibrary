package com.example.musiclibrary.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "music_library_table")
data class MusicRecord(

    @PrimaryKey(autoGenerate = true)
    var recordId: Long = 0L,

    @ColumnInfo(name = "song_name")
    var songName: String = "",

    @ColumnInfo(name = "artist_name")
    var artistName: String = "",

    @ColumnInfo(name = "album_name")
    var albumName: String = "",

    @ColumnInfo(name = "year")
    var year: Int = -1
)