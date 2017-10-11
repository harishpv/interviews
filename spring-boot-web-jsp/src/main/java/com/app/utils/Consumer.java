package com.app.utils;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
    	try {
	    	Thread.sleep(12000);
	        System.out.println(new String(message.getBody()));
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
