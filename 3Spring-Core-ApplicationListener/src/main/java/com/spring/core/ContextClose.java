package com.spring.core;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClose implements ApplicationListener<ContextClosedEvent> {


	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Application close event");
		
	}

}
