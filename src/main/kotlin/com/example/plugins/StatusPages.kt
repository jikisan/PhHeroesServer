package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import javax.naming.AuthenticationException

fun Application.configureStatusPages(){
    install(StatusPages){
        status(HttpStatusCode.NotFound){ call, status ->
            call.respond(
                message = "Page not found",
                status = status
            )
        }

//        exception<AuthenticationException> { call, status ->
//            call.respond(
//                message = "We caught an exception",
//                status = HttpStatusCode.OK
//            )
//
//        }
    }
}