package listener;

import javax.servlet.*;
import java.util.Objects;

/**
 * Created by dubo on 16/12/5.
 */
public class RequestListener implements ServletRequestListener,ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        String value = (String)srae.getValue();

        System.out.println("RequestListener attributeAdded()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        String value = (String)srae.getValue();
        System.out.println("RequestListener attributeRemoved()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        Object value = srae.getValue();
        System.out.println("RequestListener attributeReplaced()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("RequestListener requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("RequestListener requestDestroyed");
    }
}
