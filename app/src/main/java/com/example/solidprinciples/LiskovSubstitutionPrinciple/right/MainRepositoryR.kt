package com.example.solidprinciples.LiskovSubstitutionPrinciple.right

import com.example.solidprinciples.util.FirebaseAuthenticator

/*
* super classes can be replaceable by subclasses */
class MainRepositoryR
constructor(
    private val authenticator: FirebaseAuthenticator,
    private val logger: SomeOtherLogger
) {
    fun signInAndVerify(userName: String, pwd: String) {
        try {
            authenticator.signIn(userName, pwd)
        } catch (e: Exception) {
            logger.logError(e.message.toString())
        }
    }
}