package com.example.solidprinciples.SingleResponsibilityPrinciple.wrogn

import com.example.solidprinciples.util.FirebaseAuthenticator
import java.io.File

class MainRepositoryW
constructor(
    private val authenticator: FirebaseAuthenticator
) {

    /* this func violates SRP,
    it's trying to sign in & log error msgs by creating new file
    */
    fun signInAndVerify(userName: String, pwd: String) {
        try {
            authenticator.signIn(userName, pwd)
        } catch (e: Exception) {
            val logFile = File("secretLogger.txt")
            logFile.appendText(
                text = e.message.toString()
            )
        }
    }
}