package Listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // 在请求创建时执行初始化操作
        System.out.println("请求创建：" + sre.getServletRequest().getRemoteAddr());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // 在请求销毁时执行清理操作
        System.out.println("请求销毁：" + sre.getServletRequest().getRemoteAddr());
    }
}
