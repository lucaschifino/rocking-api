package dev.lucass.rocking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RockingApiApplication

fun main(args: Array<String>) {
    runApplication<RockingApiApplication>(*args)
}
