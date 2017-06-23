package com.kuwalla.app.service.db

import com.kuwalla.app.service.dao.UserDao

/**
  * Created by roei.azar on 23/06/2017
  */
trait DbService {

  def user: UserDao
}