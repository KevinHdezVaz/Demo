package com.example.movie.ui.main.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movie/ui/main/adapters/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/movie/core/BaseViewHolder;", "movieList", "", "Lcom/example/movie/data/model/Movie;", "itemClickListener", "Lcom/example/movie/ui/main/adapters/MoviesAdapter$onMovieClickListener;", "(Ljava/util/List;Lcom/example/movie/ui/main/adapters/MoviesAdapter$onMovieClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MoviesViewHolder", "onMovieClickListener", "app_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.movie.core.BaseViewHolder<?>> {
    private final java.util.List<com.example.movie.data.model.Movie> movieList = null;
    private final com.example.movie.ui.main.adapters.MoviesAdapter.onMovieClickListener itemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.movie.core.BaseViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.movie.core.BaseViewHolder<?> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie.data.model.Movie> movieList, @org.jetbrains.annotations.NotNull()
    com.example.movie.ui.main.adapters.MoviesAdapter.onMovieClickListener itemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/movie/ui/main/adapters/MoviesAdapter$onMovieClickListener;", "", "onMovieClick", "", "movie", "Lcom/example/movie/data/model/Movie;", "app_debug"})
    public static abstract interface onMovieClickListener {
        
        public abstract void onMovieClick(@org.jetbrains.annotations.NotNull()
        com.example.movie.data.model.Movie movie);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/movie/ui/main/adapters/MoviesAdapter$MoviesViewHolder;", "Lcom/example/movie/core/BaseViewHolder;", "Lcom/example/movie/data/model/Movie;", "binding", "Lcom/example/movie/databinding/MovieItemBinding;", "context", "Landroid/content/Context;", "(Lcom/example/movie/ui/main/adapters/MoviesAdapter;Lcom/example/movie/databinding/MovieItemBinding;Landroid/content/Context;)V", "getBinding", "()Lcom/example/movie/databinding/MovieItemBinding;", "getContext", "()Landroid/content/Context;", "bind", "", "item", "app_debug"})
    final class MoviesViewHolder extends com.example.movie.core.BaseViewHolder<com.example.movie.data.model.Movie> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.movie.databinding.MovieItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        com.example.movie.data.model.Movie item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie.databinding.MovieItemBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public MoviesViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.movie.databinding.MovieItemBinding binding, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
}