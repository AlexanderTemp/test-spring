package com.example.testbackend

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

private const val template = "Hola, %s"


@RestController
class GreetingController {
    private val counter = AtomicLong()


    @GetMapping("/greeting")
    fun greeting(@RequestParam name: String = "World"): Greeting {
        return Greeting(counter.incrementAndGet(), template.format(name))
    }

}
