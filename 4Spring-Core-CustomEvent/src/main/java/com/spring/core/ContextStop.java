package com.spring.core;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStop implements ApplicationListener<ContextStoppedEvent> {


	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Application stop event");
		
	}

}
