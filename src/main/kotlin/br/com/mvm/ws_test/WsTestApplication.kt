package br.com.mvm.ws_test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WsTestApplication

fun main(args: Array<String>) {
	//runApplication<WsTestApplication>(*args) https://medium.com/collabcode/implementando-uma-crud-api-no-spring-boot-com-kotlin-parte-1-c6e281d0f8f8
	SpringApplication.run(WsTestApplication::class.java, *args)
}
