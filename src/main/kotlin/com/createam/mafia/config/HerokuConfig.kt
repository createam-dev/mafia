package com.createam.mafia.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.servlet.Filter

@Configuration
class HerokuConfig {

    @Bean
    fun httpsEnforcerFilter(): Filter = HttpsEnforcer()

}