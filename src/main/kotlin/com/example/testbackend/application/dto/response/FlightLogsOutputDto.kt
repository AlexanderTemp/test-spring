package com.example.testbackend.application.dto.response

import com.example.testbackend.entities.model.FlightLogModel
import java.io.Serializable

data class FlightLogsOutputDto(
    val currency: String,
    val dateFrom: String,
    val dateTo: String,
    val flyTo: String,
    val recordDateTime: String
) : Serializable {

}
