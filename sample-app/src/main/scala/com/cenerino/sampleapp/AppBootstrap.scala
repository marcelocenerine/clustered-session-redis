package com.cenerino.sampleapp

import org.springframework.boot.SpringApplication

object AppBootstrap extends App {
  SpringApplication.run(classOf[AppConfiguration]);
}
