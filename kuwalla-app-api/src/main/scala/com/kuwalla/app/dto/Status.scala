package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class Status(status: String) {

  override def toString: String = {
    String.format("Status: %s", status)
  }
}