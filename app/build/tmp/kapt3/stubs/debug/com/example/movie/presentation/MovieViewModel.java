package com.example.movie.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/movie/presentation/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/movie/domain/MovieRepository;", "(Lcom/example/movie/domain/MovieRepository;)V", "fetchMainScreenMovies", "Landroidx/lifecycle/LiveData;", "Lcom/example/movie/core/Resource;", "Lkotlin/Triple;", "Lcom/example/movie/data/model/MovieList;", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.movie.domain.MovieRepository repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.movie.core.Resource<kotlin.Triple<com.example.movie.data.model.MovieList, com.example.movie.data.model.MovieList, com.example.movie.data.model.MovieList>>> fetchMainScreenMovies() {
        return null;
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie.domain.MovieRepository repo) {
        super();
    }
}