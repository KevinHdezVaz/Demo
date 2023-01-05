package com.example.movie.ui.main.adapters.concat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movie.core.BaseConcatHolder
import com.example.movie.databinding.PopularMoviesRowBinding
import com.example.movie.ui.main.adapters.MoviesAdapter

class PopularConcatAdapter(private val moviesAdapter: MoviesAdapter): RecyclerView.Adapter<BaseConcatHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseConcatHolder<*> {
val itemBinding = PopularMoviesRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
return ConcatViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BaseConcatHolder<*>, position: Int) {
        when(holder){
            is ConcatViewHolder -> holder.bind(moviesAdapter)
        }
    }

    override fun getItemCount(): Int  = 1

    private inner class ConcatViewHolder(val binding: PopularMoviesRowBinding): BaseConcatHolder<MoviesAdapter>(binding.root )
    {
        override fun bind(adapter: MoviesAdapter) {
            binding.rvPopularMovies.adapter = adapter
        }
    }
}

