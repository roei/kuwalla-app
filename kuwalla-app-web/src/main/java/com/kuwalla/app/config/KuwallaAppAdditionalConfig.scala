package com.kuwalla.app.config

import com.kuwalla.app.db.DbServiceFactory
import org.springframework.context.annotation.{Bean, Configuration}

/**
  * Created by roei.azar on 23/06/2017
  */
@Configuration
class KuwallaAppAdditionalConfig {

  @Bean def dbService = DbServiceFactory.create()
}
