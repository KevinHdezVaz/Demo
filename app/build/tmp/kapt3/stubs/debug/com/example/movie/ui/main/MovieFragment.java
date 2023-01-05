package com.example.movie.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/movie/ui/main/MovieFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/movie/ui/main/adapters/MoviesAdapter$onMovieClickListener;", "()V", "binding", "Lcom/example/movie/databinding/FragmentMovieBinding;", "concatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "viewModel", "Lcom/example/movie/presentation/MovieViewModel;", "getViewModel", "()Lcom/example/movie/presentation/MovieViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onMovieClick", "", "movie", "Lcom/example/movie/data/model/Movie;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MovieFragment extends androidx.fragment.app.Fragment implements com.example.movie.ui.main.adapters.MoviesAdapter.onMovieClickListener {
    private androidx.recyclerview.widget.ConcatAdapter concatAdapter;
    private com.example.movie.databinding.FragmentMovieBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    private final com.example.movie.presentation.MovieViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMovieClick(@org.jetbrains.annotations.NotNull()
    com.example.movie.data.model.Movie movie) {
    }
    
    public MovieFragment() {
        super();
    }
}