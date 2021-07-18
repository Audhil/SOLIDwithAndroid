package com.example.solidprinciples.SingleResponsibilityPrinciple.right

import java.io.File

class AppLogger {

    fun logError(error: String) {
        val logFile = File("secretLogger.txt")
        logFile.appendText(
            text = error
        )
    }
}