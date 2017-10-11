package com;

import java.util.Map;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.utils.Logging;

@Controller
public class RabbitSampleController {

	@Autowired
	RabbitTemplate rabbittemplete;
	
	@RequestMapping("/rabbitsample")
	public @ResponseBody String welcome(@RequestParam(value = "message") String cc) {
		long startTime = System.currentTimeMillis();
		try {
			Logging.getInfoLog().info("Param recieved at for queueing : " + cc);
			rabbittemplete.convertAndSend("simple.queue.name", cc);
		} catch (Exception e) {
			Logging.getErrorLog().error("Exception at controller", e);
		} 
		return "successfully queues";
	}
}
