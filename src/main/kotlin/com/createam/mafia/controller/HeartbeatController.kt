package com.createam.mafia.controller

import com.createam.mafia.service.HeartbeatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class HeartbeatController {

    @Autowired
    private val heartbeatService = HeartbeatService()

    @GetMapping("/heartbeat")
    fun greeting(request: HttpServletRequest) =
            heartbeatService.getHeartbeat(request.remoteHost)

}
