package com.cenerino.sampleapp

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@EnableAutoConfiguration
@EnableRedisHttpSession
@ComponentScan
class AppConfiguration