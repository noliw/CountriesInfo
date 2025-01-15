package com.example.countriesinfo.data.network

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService{
    @GET("name/{name}")
    suspend fun getCountryByName(@Path("name") name: String): List<Country>

}