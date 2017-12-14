package com.createam.mafia.data

import java.time.LocalDateTime

open class Game(
        val name: String,
        val gameMasterName: String,
        val creationDate: LocalDateTime,
        val playersCount: Int)