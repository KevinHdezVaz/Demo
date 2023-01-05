package com.example.movie.data.local

import android.content.Context
import android.graphics.Movie
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.movie.data.model.MovieEntity


//AQui se le coloca las entidades creadas (base de datos)
@Database(entities = [MovieEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
abstract fun movieDao(): MovieDao

companion object{
    //necesitamos crear un singleton para trabajar sobre una instancia

    private var instancia : AppDataBase?=null
    fun getDataBase(context : Context): AppDataBase{
        instancia = instancia?: Room.databaseBuilder(

            context.applicationContext,
             AppDataBase::class.java,
            "movie_table"
        ).build()
        return instancia!!
    }


    fun destroyInstance (){
        instancia=null
    }
}


}