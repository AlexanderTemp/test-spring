package com.example.testbackend.entities.model

import java.io.Serializable

data class FlightModel(
    val searchId: String,
    val fxRate: Float,
    val data: List<FlightDetails>
) : Serializable
