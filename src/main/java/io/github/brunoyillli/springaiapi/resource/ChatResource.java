package io.github.brunoyillli.springaiapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.brunoyillli.springaiapi.service.ChatService;

@RestController
@RequestMapping("/chat")
public class ChatResource {
	
	@Autowired
	ChatService chatService;
	
	@PostMapping
    public String chatWithOpenAI(@RequestBody String message) {
		return chatService.getMessage(message);
	}

}
