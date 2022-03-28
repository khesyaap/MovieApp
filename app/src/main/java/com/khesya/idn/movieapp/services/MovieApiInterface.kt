package com.khesya.idn.movieapp.services

import com.khesya.idn.movieapp.models.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("movie/popular?api_key=b4bc763d58ed4641896100dc7992db11")
    fun getMovieList(): retrofit2.Call<MovieResponse>
}