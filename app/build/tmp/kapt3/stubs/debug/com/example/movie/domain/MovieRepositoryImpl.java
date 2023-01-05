package com.example.movie.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/movie/domain/MovieRepositoryImpl;", "Lcom/example/movie/domain/MovieRepository;", "dataSource", "Lcom/example/movie/data/remote/RemoteMovieDataSource;", "localMovieDataSource", "Lcom/example/movie/data/local/LocalMovieDataSource;", "(Lcom/example/movie/data/remote/RemoteMovieDataSource;Lcom/example/movie/data/local/LocalMovieDataSource;)V", "getPopularMovies", "Lcom/example/movie/data/model/MovieList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRatedMovies", "getUpcomingMovies", "app_debug"})
public final class MovieRepositoryImpl implements com.example.movie.domain.MovieRepository {
    private final com.example.movie.data.remote.RemoteMovieDataSource dataSource = null;
    private final com.example.movie.data.local.LocalMovieDataSource localMovieDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUpcomingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0) {
        return null;
    }
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.movie.data.remote.RemoteMovieDataSource dataSource, @org.jetbrains.annotations.NotNull()
    com.example.movie.data.local.LocalMovieDataSource localMovieDataSource) {
        super();
    }
}