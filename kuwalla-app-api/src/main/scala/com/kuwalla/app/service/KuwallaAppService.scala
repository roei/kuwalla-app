package com.kuwalla.app.service

import com.kuwalla.app.dto.User

/**
  * Created by roei.azar on 23/06/2017
  */
trait KuwallaAppService {

  def update(user: User): Boolean

  def getUser(name: String): User
}
