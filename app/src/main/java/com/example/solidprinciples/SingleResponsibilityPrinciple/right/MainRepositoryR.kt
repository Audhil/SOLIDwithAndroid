package com.example.solidprinciples.SingleResponsibilityPrinciple.right

import com.example.solidprinciples.util.FirebaseAuthenticator

class MainRepositoryR
constructor(
    private val authenticator: FirebaseAuthenticator,
    private val logger: AppLogger
) {

    /* this func is based on SRP, it trys to sign in and logging is delegated to separate class */
    fun signInAndVerify(userName: String, pwd: String) {
        try {
            authenticator.signIn(userName, pwd)
        } catch (e: Exception) {
            logger.logError(e.message.toString())
        }
    }
}