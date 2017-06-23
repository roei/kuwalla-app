package com.kuwalla.app.controller

import java.util.logging.Logger
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest
/**
  * Created by roei.azar on 23/06/2017
  */
@Controller
@RequestMapping(Array("/api/ka/"))
class KuwallaAppController {

  val logger = Logger.getLogger(classOf[KuwallaAppController].getName)
  @Resource var kuwallaAppService: KuwallaAppService = _

  @ResponseBody
  @RequestMapping(value = Array(KuwallaAppEndpoints.ADD_SELECTOR), method = Array(RequestMethod.POST), produces = Array
  ("application/json"))
  def addUser(@RequestBody user: User, request: HttpServletRequest) = {
    result(kuwallaAppService.update(user))
  }

  @ResponseBody
  @RequestMapping(value = Array(KuwallaAppEndpoints.GET_SELECTOR), method = Array(RequestMethod.GET), produces =
    Array("application/json"))
  def getUser(@RequestParam name: String, request: HttpServletRequest) = {
    result(kuwallaAppService.getUser(name))
  }
}
