package com.kuwalla.app.dao;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.kuwalla.app.db.DatastoreConnectionFactory;
import com.kuwalla.app.logging.GaeLogger;

/**
 * Created by roei.azar on 23/06/2017
 */
public abstract class BaseDao {

    protected static final DatastoreService DATASTORE = DatastoreConnectionFactory.getConn();
    protected final GaeLogger logger = GaeLogger.getInstance();

    protected static String getStringProperty(Entity entity, String name) {
        return entity.getProperty(name) == null ? "" : String.valueOf(entity.getProperty(name));
    }
}
