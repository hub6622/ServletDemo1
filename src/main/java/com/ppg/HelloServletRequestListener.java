package com.ppg;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class HelloServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("requestInitialized");
    }
}
