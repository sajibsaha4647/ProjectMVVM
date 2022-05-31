package com.example.projectmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projectmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        lateinit var binding: ActivityMainBinding
        lateinit var mainviewModel: MainviewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val dao = QuotesDatabase.getDatabase(applicationContext).QuotesDaos()
        val repository = QuotesRepository(dao)
        mainviewModel = ViewModelProvider(this,MainviewModelFacory(repository)).get(MainviewModel::class.java)

        mainviewModel.getQuotes().observe(this, Observer {
            binding.quote = it.toString()
        })

        binding.clickid.setOnClickListener({
           val quoteinsrt = Quotes(0,"sajib saha do somethins","sajib saha")
            mainviewModel.insertQuote(quoteinsrt)
            Toast.makeText(applicationContext,"save successfull",Toast.LENGTH_SHORT).show()
        })

    }
}