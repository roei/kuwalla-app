package com.kuwalla.app.service

import com.kuwalla.app.dto.User
import com.kuwalla.app.service.db.DbService

/**
  * Created by roei.azar on 23/06/2017
  */
class DefaultKuwallaAppService(private val dbService: DbService) extends KuwallaAppService {

  override def update(user: User) = dbService.user.update(user)

  override def getUser(name: String): User = dbService.user.get(name)
}