package com.example.plugins

import com.example.skills.MainScenario
import com.justai.jaicf.channel.http.httpBotRouting
import com.justai.jaicf.channel.yandexalice.AliceChannel
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*

fun Application.configureRouting() {
    val scenario = MainScenario()
    routing {
        httpBotRouting("/" to AliceChannel(scenario.skill))
        get("/test") {
            call.respondText("Hello, world!")
        }
    }
}
