package com.kuwalla.app.dao

import java.util.ConcurrentModificationException

import com.google.appengine.api.datastore._
import com.kuwalla.app.db.DatastoreConnectionFactory

/**
  * Created by roei.azar on 23/06/2017
  */
class GaeSelectorMappingDao extends BaseDao with UserDao {

  final val dataStore: DatastoreService = DatastoreConnectionFactory.getConn
  final val ENTITY_KIND = "user"


  override def get(kuwallaId: String): User = {
    val key: Key = KeyFactory.createKey(ENTITY_KIND, kuwallaId)
    try {

    }
    catch {
      case e: EntityNotFoundException => throw new Exception(kuwallaId)
    }
  }


  override def update(user: User) = {
    val entity: Entity = null

    try {
      dataStore.put(entity)
    }
    catch {
      case e: IllegalArgumentException =>
      case e: ConcurrentModificationException =>
      case e: Exception =>
    }
    true
  }


}
