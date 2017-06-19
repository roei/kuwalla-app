package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class ContactInfo(email: String, phone: String) {

  override def toString: String = {
    String.format("Email: %s, Phone: %s", email, phone)
  }
}