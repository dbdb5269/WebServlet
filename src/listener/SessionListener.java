package listener;

import javax.servlet.*;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Objects;

/**
 * Created by dubo on 16/12/5.
 */
public class SessionListener implements HttpSessionListener,HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String name = se.getName();
        String value = (String)se.getValue();

        System.out.println("SessionListener attributeAdded()");
        System.out.println(name+"-----"+value);
    }


    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        String name = se.getName();
        String value = (String)se.getValue();
        System.out.println("SessionListener attributeRemoved()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        String name = se.getName();
        Object value = se.getValue();
        System.out.println("SessionListener attributeReplaced()");
        System.out.println(name+"-----"+value);
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("SessionListener Created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("SessionListener Destroyed");
    }


}
