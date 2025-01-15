package com.example.countriesinfo.data.network.utility

import kotlinx.coroutines.CancellationException
import retrofit2.HttpException
import java.io.IOException

suspend fun <T> safeApiCall(
    apiCall: suspend () -> T
): Result<T> {
    return try {
        val response = apiCall()
        Result.success(response)
    } catch (e: HttpException) {
        e.printStackTrace()
        Result.failure(Exception("HTTP error: ${e.message()}"))
    } catch (e: IOException) {
        e.printStackTrace()
        Result.failure(Exception("Network error: Please check your connection."))
    } catch (e: Exception) {
        if (e is CancellationException) throw e
        e.printStackTrace()
        Result.failure(Exception("Unknown error: ${e.message}"))
    }
}