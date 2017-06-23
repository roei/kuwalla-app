package com.kuwalla.app.service.dao

import com.kuwalla.app.dto.User

/**
  * Created by roei.azar on 23/06/2017
  */
trait UserDao {

  def get(name: String): User

  def update(userDto: User): Boolean
}
