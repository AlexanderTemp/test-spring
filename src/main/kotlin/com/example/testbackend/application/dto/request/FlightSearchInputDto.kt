package com.example.testbackend.application.dto.request

import java.io.Serializable

data class FlightSearchInputDto(
    val currency: String,
    val dateFrom: String,
    val dateTo: String,
    val flyTo: String,
    val flyFrom: String,
    val airLines: String,
) : Serializable
