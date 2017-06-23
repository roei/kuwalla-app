package com.kuwalla.app.service.db.inmemory

import com.kuwalla.app.service.dao.UserDao
import com.kuwalla.app.service.dao.inmemory.InMemoryTestDao
import com.kuwalla.app.service.db.DbService

/**
  * Created by roei.azar on 23/06/2017
  */
class InMemoryDBService extends DbService {

  private final val userDao: UserDao = new InMemoryTestDao

  override def user: UserDao = userDao
}