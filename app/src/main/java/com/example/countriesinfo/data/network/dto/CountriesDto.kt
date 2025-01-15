package com.example.countriesinfo.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountryDto(
    @SerialName("name") val name: NameDto,
    @SerialName("capital") val capital: List<String> = emptyList(),
    @SerialName("population") val population: Int,
    @SerialName("continents") val continents: List<String> = emptyList(),
    @SerialName("currencies") val currencies: Map<String, CurrencyDto>,
    @SerialName("flags") val flags: FlagDto,
    @SerialName("maps") val maps: MapDto
)

@Serializable
data class NameDto(
    @SerialName("common") val common: String,
    @SerialName("official") val official: String
)

@Serializable
data class CurrencyDto(
    @SerialName("name") val name: String,
    @SerialName("symbol") val symbol: String
)

@Serializable
data class FlagDto(
    @SerialName("png") val png: String,
    @SerialName("svg") val svg: String
)

@Serializable
data class MapDto(
    @SerialName("googleMaps") val googleMaps: String,
    @SerialName("openStreetMaps") val openStreetMaps: String
)
