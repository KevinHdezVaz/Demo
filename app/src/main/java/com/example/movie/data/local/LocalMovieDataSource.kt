package com.example.movie.data.local

import com.example.movie.application.AppConstants
import com.example.movie.data.model.MovieEntity
import com.example.movie.data.model.MovieList
import com.example.movie.data.model.toMovieList

class LocalMovieDataSource( private val movieDao: MovieDao) {

    suspend fun getUpcomingMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movieType=="upcoming"}.toMovieList()
    }

    suspend fun getTopRatedMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movieType=="toprated"}.toMovieList()
    }

    suspend fun getPopularMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movieType=="popular"}.toMovieList()
    }

    suspend fun saveMovies(movie:MovieEntity){
        movieDao.saveMovie(movie)
    }
}