package com.createam.mafia.config

import com.createam.mafia.interceptors.HeartbeatInterceptor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
class WebMvcConfig @Autowired constructor(
        private val heartbeatInterceptor: HeartbeatInterceptor
) : WebMvcConfigurerAdapter() {

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(heartbeatInterceptor)
    }
}