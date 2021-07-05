package br.com.mvm.ws_test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WsTestApplication

fun main(args: Array<String>) {
	//runApplication<WsTestApplication>(*args)
	SpringApplication.run(WsTestApplication::class.java, *args)
}
