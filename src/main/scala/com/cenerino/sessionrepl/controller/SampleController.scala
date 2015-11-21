package com.cenerino.sessionrepl.controller

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

@Controller
class SampleController {

  @RequestMapping(Array("/"))
  @ResponseBody
  def home() = "Hello World!"
}
