package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class Address(city: String, street: String) {

  override def toString: String = {
    String.format("City:%s, Street:%s", city, street)
  }
}