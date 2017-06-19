package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class Model(model: String, subModel: String) {

  override def toString: String = {
    String.format("Model: %s, Sub Model: %s", model, subModel)
  }
}