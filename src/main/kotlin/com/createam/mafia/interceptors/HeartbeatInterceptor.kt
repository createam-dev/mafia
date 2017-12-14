package com.createam.mafia.interceptors

import com.createam.mafia.service.HeartbeatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class HeartbeatInterceptor @Autowired constructor(
        private val heartbeatService: HeartbeatService
) : HandlerInterceptorAdapter() {

    override fun postHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, modelAndView: ModelAndView?) {
        modelAndView!!.modelMap.addAttribute("heartbeat", heartbeatService.getHeartbeat(request!!.remoteHost))
    }
}