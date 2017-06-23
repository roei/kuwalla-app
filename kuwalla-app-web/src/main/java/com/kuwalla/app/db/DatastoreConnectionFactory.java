package com.kuwalla.app.db;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

/**
 * Created by roei.azar on 23/06/2017
 */
public final class DatastoreConnectionFactory {

    private DatastoreConnectionFactory() {
    }

    public static DatastoreService getConn() {
        return DatastoreServiceFactory.getDatastoreService();
    }
}