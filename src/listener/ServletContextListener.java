package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by dubo on 16/12/5.
 */
public class ServletContextListener implements ServletRequestListener,ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        String value = (String)scae.getValue();

        System.out.println("ServletContextListener attributeAdded()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        String value = (String)scae.getValue();

        System.out.println("ServletContextListener attributeRemoved()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();

        System.out.println("ServletContextListener attributeReplaced()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletContextListener requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletContextListener requestInitialized");
    }
}
