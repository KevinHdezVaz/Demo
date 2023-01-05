package com.example.movie.ui.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.movie.R
import kotlin.Float
import kotlin.Int
import kotlin.String

public class MovieFragmentDirections private constructor() {
  private data class ActionMovieFragmentToMovieDetailFragment(
    public val posterImageUrl: String,
    public val backgroundImageUrl: String,
    public val voteAverage: Float,
    public val voteCount: Int,
    public val title: String,
    public val language: String,
    public val releaseDate: String,
    public val overview: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_movieFragment_to_movieDetailFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("posterImageUrl", this.posterImageUrl)
      result.putString("backgroundImageUrl", this.backgroundImageUrl)
      result.putFloat("voteAverage", this.voteAverage)
      result.putInt("voteCount", this.voteCount)
      result.putString("title", this.title)
      result.putString("language", this.language)
      result.putString("releaseDate", this.releaseDate)
      result.putString("overview", this.overview)
      return result
    }
  }

  public companion object {
    public fun actionMovieFragmentToMovieDetailFragment(
      posterImageUrl: String,
      backgroundImageUrl: String,
      voteAverage: Float,
      voteCount: Int,
      title: String,
      language: String,
      releaseDate: String,
      overview: String
    ): NavDirections = ActionMovieFragmentToMovieDetailFragment(posterImageUrl, backgroundImageUrl,
        voteAverage, voteCount, title, language, releaseDate, overview)
  }
}
