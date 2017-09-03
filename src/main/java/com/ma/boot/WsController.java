package com.ma.boot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {

	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public ResponseMaMessage say(MaMessage message) throws InterruptedException {
		Thread.sleep(3000);
		return new ResponseMaMessage("Welcom, " + message.getName() +"!");
	}
}
