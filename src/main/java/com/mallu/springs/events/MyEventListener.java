package com.mallu.springs.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by golagem on 10/7/17.
 */

@Component
public class MyEventListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Application Event:"+applicationEvent.toString());
    }
}
