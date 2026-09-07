package com.example.testbackend.entities.model

import java.io.Serializable
import java.time.LocalDateTime

data class FlightLogModel(
    val id: Int? = null,
    val flyTo: String,
    val currency: String,
    val dateTo: String,
    val dateFrom: String,
    val recordDateTime: LocalDateTime? = null
) : Serializable {

    constructor(
        flyTo: String,
        dateTo: String,
        currency: String,
        dateFrom: String,
        recordDateTime: LocalDateTime
    ) : this(null, flyTo, currency, dateTo, dateFrom, recordDateTime)


    constructor() :
            this(null, "", "", "", "", null)


}
