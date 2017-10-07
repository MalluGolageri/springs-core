package com.mallu.springs.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by golagem on 10/7/17.
 */
public class CustomEvent extends ApplicationEvent{

    public CustomEvent(Object event){
        super(event);
    }

    @Override
    public String toString() {
        return "Custom event fired";
    }
}
