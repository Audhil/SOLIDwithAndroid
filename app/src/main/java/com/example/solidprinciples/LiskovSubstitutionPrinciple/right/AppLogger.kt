package com.example.solidprinciples.LiskovSubstitutionPrinciple.right

import java.io.File

open class AppLogger {

    /*
    * we should not modify the parent/main class
    * */
    open fun logError(error: String) {
        val logFile = File("secretLogger.txt")
        logFile.appendText(
            text = error
        )
    }
}

class SomeOtherLogger : AppLogger() {

    override fun logError(error: String) {
        val logFile = File("secretLogger1.txt")
        logFile.appendText(
            text = error
        )
    }
}
