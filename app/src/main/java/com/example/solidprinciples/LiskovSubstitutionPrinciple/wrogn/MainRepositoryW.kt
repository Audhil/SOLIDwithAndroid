package com.example.solidprinciples.LiskovSubstitutionPrinciple.wrogn

import com.example.solidprinciples.util.FirebaseAuthenticator

/*
* super classes can be replaceable by subclasses */
class MainRepositoryW
constructor(
    private val authenticator: FirebaseAuthenticator,
    private val logger: SomeOtherLogger
) {

    /*  SomeOtherLogger doesn't override logError() function, and trying to access,
        but it'll end up using super class logError(),
        but we intended to use customLogError() functionality
    */
    fun signInAndVerify(userName: String, pwd: String) {
        try {
            authenticator.signIn(userName, pwd)
        } catch (e: Exception) {
            logger.logError(e.message.toString())
        }
    }
}