package com.example.firstapp.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AddContactTable")
data class ListData (
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name = "Name",defaultValue = "Unknown")
    var name:String,
    @ColumnInfo(name = "email")
    var email:String
)