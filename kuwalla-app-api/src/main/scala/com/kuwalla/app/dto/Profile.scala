package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class Profile(socialMedia: SocialMedia, contactInfo: ContactInfo) {

  override def toString: String = {
    String.format("Social Media: %s, Contact info: %s", socialMedia.toString, contactInfo.toString)
  }
}