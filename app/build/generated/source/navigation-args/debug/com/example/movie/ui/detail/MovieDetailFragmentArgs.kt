package com.example.movie.ui.detail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class MovieDetailFragmentArgs(
  public val posterImageUrl: String,
  public val backgroundImageUrl: String,
  public val voteAverage: Float,
  public val voteCount: Int,
  public val title: String,
  public val language: String,
  public val releaseDate: String,
  public val overview: String
) : NavArgs {
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MovieDetailFragmentArgs {
      bundle.setClassLoader(MovieDetailFragmentArgs::class.java.classLoader)
      val __posterImageUrl : String?
      if (bundle.containsKey("posterImageUrl")) {
        __posterImageUrl = bundle.getString("posterImageUrl")
        if (__posterImageUrl == null) {
          throw IllegalArgumentException("Argument \"posterImageUrl\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"posterImageUrl\" is missing and does not have an android:defaultValue")
      }
      val __backgroundImageUrl : String?
      if (bundle.containsKey("backgroundImageUrl")) {
        __backgroundImageUrl = bundle.getString("backgroundImageUrl")
        if (__backgroundImageUrl == null) {
          throw IllegalArgumentException("Argument \"backgroundImageUrl\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"backgroundImageUrl\" is missing and does not have an android:defaultValue")
      }
      val __voteAverage : Float
      if (bundle.containsKey("voteAverage")) {
        __voteAverage = bundle.getFloat("voteAverage")
      } else {
        throw IllegalArgumentException("Required argument \"voteAverage\" is missing and does not have an android:defaultValue")
      }
      val __voteCount : Int
      if (bundle.containsKey("voteCount")) {
        __voteCount = bundle.getInt("voteCount")
      } else {
        throw IllegalArgumentException("Required argument \"voteCount\" is missing and does not have an android:defaultValue")
      }
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __language : String?
      if (bundle.containsKey("language")) {
        __language = bundle.getString("language")
        if (__language == null) {
          throw IllegalArgumentException("Argument \"language\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"language\" is missing and does not have an android:defaultValue")
      }
      val __releaseDate : String?
      if (bundle.containsKey("releaseDate")) {
        __releaseDate = bundle.getString("releaseDate")
        if (__releaseDate == null) {
          throw IllegalArgumentException("Argument \"releaseDate\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"releaseDate\" is missing and does not have an android:defaultValue")
      }
      val __overview : String?
      if (bundle.containsKey("overview")) {
        __overview = bundle.getString("overview")
        if (__overview == null) {
          throw IllegalArgumentException("Argument \"overview\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"overview\" is missing and does not have an android:defaultValue")
      }
      return MovieDetailFragmentArgs(__posterImageUrl, __backgroundImageUrl, __voteAverage,
          __voteCount, __title, __language, __releaseDate, __overview)
    }
  }
}
