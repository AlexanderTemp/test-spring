package com.example.testbackend.entities.gateway

import com.example.testbackend.entities.model.FlightLogModel


interface FlightsLogsGateway {
    fun findAll(page: Int, rpp: Int): List<FlightLogModel>?
    fun findById(id: Any): FlightLogModel?

    fun deleteAll()
    fun deleteById(id: Any)
    fun create(record: FlightLogModel)


}
