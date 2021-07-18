package com.example.solidprinciples.OpenClosePrinciple.right

import java.io.File

/*
* anything(class) should be
*   open for extension and
*   closed for modification
* */

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

class SomeOtherLogger2 : AppLogger() {

    override fun logError(error: String) {
        val logFile = File("secretLogger2.txt")
        logFile.appendText(
            text = error
        )
    }
}