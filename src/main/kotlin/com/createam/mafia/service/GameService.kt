package com.createam.mafia.service

import com.createam.mafia.data.Game
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class GameService {

    private val logger = LoggerFactory.getLogger(GameService::class.java)


    fun registerNewGame(game: Game) : String {
        logger.info("registering new game")
        return ""
    }
}