package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class SocialMedia(linkedIn: String, facebook: String) {

  override def toString: String = {
    String.format("LinkedIn:%s, Facebook:%s", linkedIn, facebook)
  }
}