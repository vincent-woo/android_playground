package com.vincent.usecases.service

import com.vincent.entities.Movie

interface IMovieService {
    fun searchMovies(title: String, page: Int): List<Movie>?
}