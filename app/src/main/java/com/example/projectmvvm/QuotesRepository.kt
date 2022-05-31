package com.example.projectmvvm

import androidx.lifecycle.LiveData

class QuotesRepository(private val QuoteDao:QuoteDAO) {

    fun getQuotes():LiveData<List<Quotes>>{
        return QuoteDao.getQuotes() ;
    }

    suspend fun InsertQuotes(quotes: Quotes){
        QuoteDao.InsertQuotes(quotes)
    }
}