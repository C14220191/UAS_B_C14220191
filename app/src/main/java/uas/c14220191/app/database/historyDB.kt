package uas.c14220191.app.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [historyKesehatan::class], version = 1)
abstract class historyKesehatanDB : RoomDatabase(){
    abstract fun historyKesehatanDAO(): historyKesehatanDAO

    companion object{
        @Volatile
        private var INSTANCE: historyKesehatanDB? = null

        @JvmStatic
        fun getDatabase(context: Context): historyKesehatanDB{
            if (INSTANCE == null){
                synchronized(historyKesehatanDB::class.java){
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        historyKesehatanDB::class.java, "historyKesehatanDB"
                    )
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE as historyKesehatanDB
        }
    }

}