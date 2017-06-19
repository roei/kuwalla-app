package com.kuwalla.app.dto

/**
  * Created by roei.azar on 18/06/2017
  */
case class User(name: String, id: String, kuId: String, gender: String, age: String,
                profile: Profile, address: Address, carInfo: CarInfo,
                reputation: Reputation, kuHistory: KuHistory, group: Group) {

  override def toString: String = {
    String.format("Id: %s, kuId: %s, Gender: %s, Age: %s, Profile: %s, Address: %s, Car Info: %s, %s, " +
      "%s", id, kuId, gender, age, profile.toString, address.toString, carInfo.toString, reputation
      .toString, kuHistory)
  }

}