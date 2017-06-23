package com.kuwalla.app.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by roei.azar on 23/06/2017
 */
public final class GaeLogger {

    private static final class SingletonHolder {

        private static final GaeLogger INSTANCE = new GaeLogger();
    }

    private final Logger logger;

    private GaeLogger() {
        logger = Logger.getLogger("Kuwalla Logger");
    }

    public static GaeLogger getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void log(Level level, String message) {
        logger.log(level, message);
    }
}
