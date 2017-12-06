package com.createam.mafia.controller

import com.createam.mafia.data.Heartbeat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class HeartbeatController {

    val counter = AtomicLong()

    @GetMapping("/heartbeat")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Heartbeat(counter.incrementAndGet(), "Hello, $name")

}
