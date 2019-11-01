package com.example.musiclibrary.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MusicDatabaseDao {

    @Insert
    fun insert(song: MusicRecord)

    @Update
    fun update(song: MusicRecord)

    @Query("DELETE FROM music_library_table")
    fun clear()

    @Query("SELECT * FROM music_library_table WHERE recordId = :key")
    fun get(key: Long): MusicRecord?

    @Query("SELECT * FROM music_library_table ORDER BY song_name")
    fun getAllSongs() : LiveData<List<MusicRecord>>

    @Query("SELECT * FROM music_library_table WHERE artist_name = :artist")
    fun getArtistSongs(artist: String) : LiveData<List<MusicRecord>>

}