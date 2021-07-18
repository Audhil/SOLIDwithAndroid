package com.example.solidprinciples.OpenClosePrinciple.wrogn

import java.io.File

class AppLogger {

    fun logError(error: String) {
        val logFile = File("secretLogger.txt")
        logFile.appendText(
            text = error
        )
    }
}