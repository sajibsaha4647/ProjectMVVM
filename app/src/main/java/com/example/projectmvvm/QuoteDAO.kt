package com.example.projectmvvm

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDAO {

    @Query("SELECT * FROM quote")
    fun getQuotes(quotes: Quotes):LiveData<List<Quotes>>

    @Insert
    suspend fun InsertQuotes(quotes: Quotes){

    }


}