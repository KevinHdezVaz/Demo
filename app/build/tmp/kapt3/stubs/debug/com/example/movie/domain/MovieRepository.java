package com.example.movie.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/movie/domain/MovieRepository;", "", "getPopularMovies", "Lcom/example/movie/data/model/MovieList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRatedMovies", "getUpcomingMovies", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUpcomingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0);
}