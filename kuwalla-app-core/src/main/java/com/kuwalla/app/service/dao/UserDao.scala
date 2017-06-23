package com.kuwalla.app.service.dao

/**
  * Created by roei.azar on 23/06/2017
  */
trait UserDao {

  def get(name: String): UserDao

  def update(userDto: UserDao): Boolean
}
