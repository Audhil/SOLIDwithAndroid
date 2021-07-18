package com.example.solidprinciples.InterfaceSegregationPrinciple

import java.io.File

interface SomeLoggerW {

    fun printLog()

    fun logError(error: String) {
        val logFile = File("secretLogger1.txt")
        logFile.appendText(
            text = error
        )
    }
}

class MCclass : SomeLoggerW {

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

/*
* this class doesn't need printLog function, but has no other option */
class MCclass2 : SomeLoggerW {

    override fun printLog() {
    }

    override fun logError(error: String) {
        val logFile = File("secretLogger222.txt")
        logFile.appendText(
            text = error
        )
    }
}