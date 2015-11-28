package com.cenerino.sampleapp.controller

import javax.servlet.http.HttpSession

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMethod.{DELETE, GET, POST}
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestParam}

@Controller
@RequestMapping(Array("/session"))
class SessionController {

  @RequestMapping(method = Array(GET))
  def index() = "index"

  @RequestMapping(method = Array(POST))
  def add(@RequestParam("key") key: String, @RequestParam("value") value: String, session: HttpSession) = {
    session.setAttribute(key, value)
    index
  }

  @RequestMapping(path = Array("/{key}"), method = Array(DELETE))
  def delete(@PathVariable("key") key: String, session: HttpSession) = {
    session.removeAttribute(key)
    index
  }
}
