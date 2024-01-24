package io.github.brunoyillli.springaiapi.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	@Autowired
	ChatClient chatClient;
	
	public String getMessage(String message) {
		String resposta = chatClient.generate(message);
		return resposta;
	}
}
