package com.spring.core.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.spring.core.event.CustomEvent;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher applicationEventPublisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
		
	}
	public void publish() {
		CustomEvent customEvent=new CustomEvent(applicationEventPublisher);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
