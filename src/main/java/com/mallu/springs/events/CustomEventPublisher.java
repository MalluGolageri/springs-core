package com.mallu.springs.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by golagem on 10/7/17.
 */

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware{

    ApplicationEventPublisher eventPublisher;

    public void publishCustomEvent(){
        CustomEvent customEvent=new CustomEvent(this);
        eventPublisher.publishEvent(customEvent);
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher=applicationEventPublisher;
    }
}
