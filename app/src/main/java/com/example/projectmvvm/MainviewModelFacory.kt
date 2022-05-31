package com.example.projectmvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainviewModelFacory(private val quotesRepository: QuotesRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainviewModel(quotesRepository) as T
    }
}