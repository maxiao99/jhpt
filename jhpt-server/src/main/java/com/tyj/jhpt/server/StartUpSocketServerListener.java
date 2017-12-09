package com.tyj.jhpt.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/3
 */
public class StartUpSocketServerListener implements ServletContextListener {
    private static final Logger logger = LoggerFactory.getLogger(StartUpSocketServerListener.class);

    DeviceManagerServer server;

    Thread shutdownHook;

    public void contextInitialized(ServletContextEvent sce) {
        SystemConfig.init("system-config.properties");
        server = new DeviceManagerServer(SystemConfig.getInt("socketServerPort"));
        server.start();
        if (shutdownHook == null) {
            shutdownHook = new ShutdownHook();
        }
        Runtime.getRuntime().addShutdownHook(shutdownHook);
    }

    public void contextDestroyed(ServletContextEvent sce) {
        if (server != null) {
            server.close();
        }
    }

    public class ShutdownHook extends Thread {

        public void run() {
            try {
                if (StartUpSocketServerListener.this.server != null) {
                    StartUpSocketServerListener.this.server.close();
                }
            } catch (Throwable ex) {
                logger.error("{}", ex);
            } finally {

            }
        }
    }
}
