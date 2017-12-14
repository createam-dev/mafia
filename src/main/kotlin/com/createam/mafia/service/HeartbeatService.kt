package com.createam.mafia.service

import com.createam.mafia.data.Heartbeat
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong

@Service
class HeartbeatService {

    private val counter = AtomicLong()

    fun getHeartbeat(message : String) =
            Heartbeat(counter.incrementAndGet(), "Hello, $message")
}