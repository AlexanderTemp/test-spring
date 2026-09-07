package com.example.testbackend.entities.gateway

interface LoggerGateway {
    fun info(message: String)
    fun info(message: String, data: String)


    fun warn(message: String)
    fun warn(message: String, data: String)

    fun error(message: String, throwable: Throwable)
}
