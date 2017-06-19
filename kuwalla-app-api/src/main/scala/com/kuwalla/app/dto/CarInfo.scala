package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class CarInfo(year: String, licensePlate: String, model: Model) {

  override def toString: String = {
    String.format("Year: %s, LicensePlate: %s, %s", year, licensePlate, model.toString)
  }
}