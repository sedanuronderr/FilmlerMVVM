package com.example.moviesappmvvm.Api

import com.example.moviesappmvvm.Constans
import com.example.moviesappmvvm.module.Model
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constans.END_POINT)
    suspend fun  getTvShows(): Response<Model>
}