package com.createam.mafia.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ThymeleafController {

    @GetMapping("/")
    fun home(): String {
        return "home"
    }
}