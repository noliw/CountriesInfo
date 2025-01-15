package com.example.countriesinfo.data.network

import com.example.countriesinfo.data.network.dto.CountryDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService{
    @GET("name/{name}")
    suspend fun getCountryByName(@Path("name") name: String): List<CountryDto>


}