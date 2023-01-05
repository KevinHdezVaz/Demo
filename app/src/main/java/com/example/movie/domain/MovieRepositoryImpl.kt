package com.example.movie.domain

import com.example.movie.core.InternetCheck
import com.example.movie.data.local.LocalMovieDataSource
import com.example.movie.data.remote.RemoteMovieDataSource
import com.example.movie.data.model.MovieList
import com.example.movie.data.model.toMovieEntity

class MovieRepositoryImpl(private val dataSource: RemoteMovieDataSource,
private val localMovieDataSource: LocalMovieDataSource): MovieRepository {

    override suspend fun getUpcomingMovies(): MovieList {

        return if(InternetCheck.isNetworkAvailable()){

            dataSource.getUpcomingMovies().results.forEach{
                localMovieDataSource.saveMovies(it.toMovieEntity("upcoming"))
        }
            localMovieDataSource.getUpcomingMovies()
        }else{
            localMovieDataSource.getUpcomingMovies()
        }

    }

    override suspend fun getTopRatedMovies(): MovieList {

        return if(InternetCheck.isNetworkAvailable()){
        dataSource.getTopRatedMovies().results.forEach{
            localMovieDataSource.saveMovies(it.toMovieEntity("toprated"))
        }
          localMovieDataSource.getTopRatedMovies()
    }else{
            localMovieDataSource.getTopRatedMovies()

        }
    }

    override suspend fun getPopularMovies(): MovieList {

        return if(InternetCheck.isNetworkAvailable()){

            dataSource.getPopularMovies().results.forEach{
            localMovieDataSource.saveMovies(it.toMovieEntity("popular"))
        }

          localMovieDataSource.getPopularMovies()

    } else{
            localMovieDataSource.getPopularMovies()
        }
    }

}