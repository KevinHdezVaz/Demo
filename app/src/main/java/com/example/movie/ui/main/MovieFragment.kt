package com.example.movie.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ConcatAdapter
import com.example.movie.R
import com.example.movie.core.Resource
import com.example.movie.data.model.Movie
import com.example.movie.data.remote.MovieDataSource
import com.example.movie.databinding.FragmentMovieBinding
import com.example.movie.domain.MovieRepositoryImpl
import com.example.movie.domain.RetrofitClient
import com.example.movie.presentation.MovieViewModel
import com.example.movie.presentation.MovieViewModelFactory
import com.example.movie.ui.main.adapters.concat.UpcomingConcatAdapter
import com.example.movie.ui.main.adapters.MoviesAdapter
import com.example.movie.ui.main.adapters.concat.PopularConcatAdapter
import com.example.movie.ui.main.adapters.concat.TopRatedConcatAdapter


class MovieFragment : Fragment(R.layout.fragment_movie), MoviesAdapter.onMovieClickListener {

    private lateinit var concatAdapter: ConcatAdapter
    private lateinit var binding: FragmentMovieBinding
    private val viewModel by viewModels<MovieViewModel> { MovieViewModelFactory(MovieRepositoryImpl(MovieDataSource(RetrofitClient.webservice))) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        concatAdapter = ConcatAdapter()

        viewModel.fetchMainScreenMovies().observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Loading -> {
                   binding.progressBar.visibility = View.VISIBLE
                    Log.d("LiveData", "Loading...")
                }
                is Resource.Success -> {

                    binding.progressBar.visibility = View.GONE
                    concatAdapter.apply {
                        addAdapter(0, UpcomingConcatAdapter(MoviesAdapter(it.data.first.results,this@MovieFragment)))
                        addAdapter(1, TopRatedConcatAdapter(MoviesAdapter(it.data.second.results,this@MovieFragment)))
                        addAdapter(2, PopularConcatAdapter(MoviesAdapter(it.data.third.results,this@MovieFragment)))

                    }
                    binding.rvMovies.adapter = concatAdapter


                    Log.d("LiveData", "${it.data}")

                }

                is Resource.Failure -> {
                    binding.progressBar.visibility = View.GONE
                    Log.e("FetchError", "Error: $it.exception ")
                    Toast.makeText(requireContext(), "Error: ${it.exception}", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })
    }

    override fun onMovieClick(movie: Movie) {
        //para desplazarse se necesita el moviefragmentDirections

        val action = MovieFragmentDirections.actionMovieFragmentToMovieDetailFragment(
            movie.poster_path,
            movie.backdrop_path,
            movie.vote_average.toFloat(),
            movie.vote_count,
            movie.title,
            movie.original_language,
            movie.release_date,
            movie.overview

        )
         findNavController().navigate(action)
    }
}