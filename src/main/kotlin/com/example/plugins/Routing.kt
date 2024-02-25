package com.example.plugins

import com.example.routes.getAllHeroes
import com.example.routes.getAllHeroesAlternative
import com.example.routes.root
import com.example.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import javax.naming.AuthenticationException

fun Application.configureRouting() {
    routing {
        root()
//        getAllHeroesAlternative()
        getAllHeroes()
        searchHeroes()

//        get("/test2"){
//            throw AuthenticationException()
//
//        }

//        staticResources("/images", "images")

        static("/images") {
            resources("images")
        }
    }
}
