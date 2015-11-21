package com.cenerino.sessionrepl

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@Configuration
@EnableAutoConfiguration
@EnableRedisHttpSession
@ComponentScan
class Configuration