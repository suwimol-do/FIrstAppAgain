package com.example.firstapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ListData::class],version = 1)
abstract class ListDataBase : RoomDatabase() {
    companion object {
        @Volatile
        private var model: ListDataBase? = null
        fun getDatabase(context: Context): ListDataBase? {
            synchronized(this) {
                var _model = model
                if (_model == null) {
                    model = Room.databaseBuilder(
                        context.applicationContext,
                        ListDataBase::class.java,
                        "contact_list_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    model = _model
                }
                return _model
            }
        }
    }
}