package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class Group(group: String) {

  override def toString: String = {
    String.format("Group: %s", group)
  }
}