package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Chat;

public interface ChatService {
	void AddChat(Chat c);
	
	List<Chat> AllChat();
	
	void UpdateChat(Chat c);
	
	void DelectChat(int id);
}
