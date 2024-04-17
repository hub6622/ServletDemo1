package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyAppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 在应用程序启动时执行初始化操作
        System.out.println("Web应用程序初始化...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 在应用程序关闭时执行清理操作
        System.out.println("Web应用程序销毁...");
    }
}
