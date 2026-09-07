package com.example.testbackend.entities.model

import java.io.Serializable


data class FlightDetails(
    val id: String,
    val cityFrom: String,
    val cityCodeFrom: String,
    val flyTo: String,
    val cityTo: String,
    val cityCodeTo: String,
    val price: Float,
    val dTime: Long,
    val dTimeFormatted: String,
    val aTimeFormatted: String,
    val dTimeUTC: Long,
    val aTime: Long,
    val aTimeUTC: Long,
    val baggage: FlightBagPrice
) : Serializable
