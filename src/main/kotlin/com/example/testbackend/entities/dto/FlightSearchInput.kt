package com.example.testbackend.entities.dto

data class FlightSearchInput(
    val currency: String,
    val dateFrom: String,
    val dateTo: String,
    val flyTo: String,
    val flyFrom: String,
    val airLines: String,
)
