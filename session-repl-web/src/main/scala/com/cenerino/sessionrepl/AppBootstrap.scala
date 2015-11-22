package com.cenerino.sessionrepl

import org.springframework.boot.SpringApplication

object AppBootstrap extends App {
  SpringApplication.run(classOf[AppConfiguration]);
}
