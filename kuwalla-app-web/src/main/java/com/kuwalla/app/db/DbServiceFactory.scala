package com.kuwalla.app.db

import com.google.appengine.api.utils.SystemProperty

/**
  * Created by roei.azar on 23/06/2017
  */
object DbServiceFactory {

  private final val isProduction = SystemProperty.environment.value == SystemProperty.Environment.Value.Production

  def create(): DbService = if (isProduction) new GaeDBService else new InMemoryDBService
}
