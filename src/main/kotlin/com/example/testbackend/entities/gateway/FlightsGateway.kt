package com.example.testbackend.entities.gateway

import com.example.testbackend.entities.dto.FlightSearchInput
import com.example.testbackend.entities.model.FlightModel
import com.example.testbackend.entities.model.LocationModel

interface FlightsGateway {
    fun getFlights(input: FlightSearchInput): FlightModel
    fun getLocation(iata: String): LocationModel

}
