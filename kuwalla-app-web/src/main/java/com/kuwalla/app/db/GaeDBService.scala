package com.kuwalla.app.db

import com.kuwalla.app.dao.GaeUserDao
import com.kuwalla.app.service.dao.UserDao
import com.kuwalla.app.service.db.DbService

/**
  * Created by roei.azar on 23/06/2017
  */
class GaeDBService extends DbService {

  private final val userDao: UserDao = new GaeUserDao

  override def user: UserDao = userDao

}