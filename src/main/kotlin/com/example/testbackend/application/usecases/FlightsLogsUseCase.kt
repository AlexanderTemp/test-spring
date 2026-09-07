package com.example.testbackend.application.usecases

interface FlightsLogsUseCase {
    fun filterFlightsLogs(page: Int, rpp: Int): List<Flight>
}
