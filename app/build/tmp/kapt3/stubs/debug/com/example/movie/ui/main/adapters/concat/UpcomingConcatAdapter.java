package com.example.movie.ui.main.adapters.concat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001c\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/movie/ui/main/adapters/concat/UpcomingConcatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/movie/core/BaseConcatHolder;", "moviesAdapter", "Lcom/example/movie/ui/main/adapters/MoviesAdapter;", "(Lcom/example/movie/ui/main/adapters/MoviesAdapter;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ConcatViewHolder", "app_debug"})
public final class UpcomingConcatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.movie.core.BaseConcatHolder<?>> {
    private final com.example.movie.ui.main.adapters.MoviesAdapter moviesAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.movie.core.BaseConcatHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.movie.core.BaseConcatHolder<?> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public UpcomingConcatAdapter(@org.jetbrains.annotations.NotNull()
    com.example.movie.ui.main.adapters.MoviesAdapter moviesAdapter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/movie/ui/main/adapters/concat/UpcomingConcatAdapter$ConcatViewHolder;", "Lcom/example/movie/core/BaseConcatHolder;", "Lcom/example/movie/ui/main/adapters/MoviesAdapter;", "binding", "Lcom/example/movie/databinding/UpcomingMovieRowBinding;", "(Lcom/example/movie/ui/main/adapters/concat/UpcomingConcatAdapter;Lcom/example/movie/databinding/UpcomingMovieRowBinding;)V", "getBinding", "()Lcom/example/movie/databinding/UpcomingMovieRowBinding;", "bind", "", "adapter", "app_debug"})
    final class ConcatViewHolder extends com.example.movie.core.BaseConcatHolder<com.example.movie.ui.main.adapters.MoviesAdapter> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.movie.databinding.UpcomingMovieRowBinding binding = null;
        
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        com.example.movie.ui.main.adapters.MoviesAdapter adapter) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie.databinding.UpcomingMovieRowBinding getBinding() {
            return null;
        }
        
        public ConcatViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.movie.databinding.UpcomingMovieRowBinding binding) {
            super(null);
        }
    }
}