package com.createam.mafia.controller

import com.createam.mafia.service.GameService
import com.createam.mafia.data.Game
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest

@Controller
class SetupController @Autowired constructor(
        private val gameService: GameService
) {

    private val logger = LoggerFactory.getLogger(SetupController::class.java)

    @GetMapping("/")
    fun home(request: HttpServletRequest): String {
        logger.info("Request from {}", request.remoteHost)
        return "setup"
    }

    @PostMapping("/setup/game-creation")
    fun gameCreation(model: ModelMap): String {
        val game = Game(
                model.getValue("name") as String,
                model.getValue("") as String,
                LocalDateTime.now(),
                model.getValue("") as Int)
        gameService.registerNewGame(game)

        return ""
    }
}