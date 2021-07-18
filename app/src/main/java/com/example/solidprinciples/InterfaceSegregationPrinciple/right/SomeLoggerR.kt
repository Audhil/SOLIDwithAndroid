package com.example.solidprinciples.InterfaceSegregationPrinciple.right

import java.io.File

/* option 1: giving default implementation here itself */
interface SomeLoggerR {

    fun printLog() {}

    fun logError(error: String) {
        val logFile = File("secretLogger1.txt")
        logFile.appendText(
            text = error
        )
    }
}

class MCclass : SomeLoggerR {

    override fun printLog() {
        println("yup: MCclass printLog")
    }

    override fun logError(error: String) {
        val logFile = File("secretLogger222.txt")
        logFile.appendText(
            text = error
        )
    }
}

class MCclass2 : SomeLoggerR {

    override fun logError(error: String) {
        val logFile = File("secretLogger222.txt")
        logFile.appendText(
            text = error
        )
    }
}

/* option 2: create another interface */
interface SubLogger : SomeLoggerR

class MCclass3 : SubLogger {

    override fun logError(error: String) {
        //  do something
    }
}