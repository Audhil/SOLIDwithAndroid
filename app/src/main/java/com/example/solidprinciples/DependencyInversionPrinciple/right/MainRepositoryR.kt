package com.example.solidprinciples.DependencyInversionPrinciple

import com.example.solidprinciples.util.FirebaseAuthenticator
import com.example.solidprinciples.util.RetroAuthenticator

interface Authenticator {
    fun signInAndVerify(userName: String, pwd: String)
}

class FireBaseAuth : Authenticator{

    private val authenticator: FirebaseAuthenticator = FirebaseAuthenticator()

    override fun signInAndVerify(userName: String, pwd: String) {
        authenticator.signIn(userName, pwd)
    }
}

class RetroAuth : Authenticator{

    private val authenticator: RetroAuthenticator = RetroAuthenticator()

    override fun signInAndVerify(userName: String, pwd: String) {
        authenticator.signIn(userName, pwd)
    }
}

//  dagger module to give objects
//@Module
//class ObjModule{
//
//    @Provides
//    fun giveFireBaseAuth() : FireBaseAuth = FireBaseAuth()
//
//    @Provides
//    fun giveRetroAuth() : RetroAuth = RetroAuth()
//}

class MainRepositoryR
constructor(
    private val authenticator: Authenticator    //  it doesn't matter, it can be FirebaseAuth or RetroAuth
) {

    fun signInAndVerify(userName: String, pwd: String) {
        try {
            authenticator.signInAndVerify(userName, pwd)
        } catch (e: Exception) {
        }
    }
}