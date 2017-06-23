package com.kuwalla.app.db

/**
  * Created by roei.azar on 23/06/2017
  */
class GaeDBService extends DbService {

  private final val userDao: UserDao = new GaeUserDao

  override def user: UserDao = userDao

}