package com.example.projectmvvm

import androidx.lifecycle.LiveData

class QuotesRepository(val QuoteDao:QuoteDAO) {

    fun getQuotes(quotes: Quotes):LiveData<List<Quotes>>{
        return QuoteDao.getQuotes() ;
    }

    suspend fun InsertQuotes(quotes: Quotes){
        QuoteDao.InsertQuotes(quotes)
    }
}