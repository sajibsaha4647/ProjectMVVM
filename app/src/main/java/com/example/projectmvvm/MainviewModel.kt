package com.example.projectmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainviewModel(private  val quotesRepository: QuotesRepository): ViewModel() {

    fun getQuotes():LiveData<List<Quotes>>{
        return quotesRepository.getQuotes()
    }


    fun insertQuote(quotes: Quotes){
        viewModelScope.launch(Dispatchers.IO) {
            quotesRepository.InsertQuotes(quotes)
        }
    }
}