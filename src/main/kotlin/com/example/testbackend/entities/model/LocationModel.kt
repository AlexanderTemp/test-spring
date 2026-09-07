package com.example.testbackend.entities.model

import java.io.Serializable

data class LocationModel(
    val locations: List<FlightLocation>
) : Serializable
