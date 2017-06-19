package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class KuHistory(status: Status) {

  override def toString: String = {
    String.format("Kuwalla history: %s", status.toString)
  }
}