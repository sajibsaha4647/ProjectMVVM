package com.example.projectmvvm

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Quotes(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val text:String,
    val author:String
)
