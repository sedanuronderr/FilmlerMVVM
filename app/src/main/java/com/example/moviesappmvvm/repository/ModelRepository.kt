package com.example.moviesappmvvm.repository

import com.example.moviesappmvvm.Api.ApiService
import javax.inject.Inject

class ModelRepository
@Inject
constructor(private val apiService : ApiService)
{
    suspend fun getTvShows()= apiService.getTvShows()
}