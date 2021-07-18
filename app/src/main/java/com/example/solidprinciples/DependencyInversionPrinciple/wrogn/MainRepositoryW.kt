package com.example.solidprinciples.DependencyInversionPrinciple.wrogn

import com.example.solidprinciples.util.FirebaseAuthenticator

/*
* using FirebaseAuthenticator here is wrong,
* we cannot edit all files when we plan to use some other authenticator
* */
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
        }
    }
}