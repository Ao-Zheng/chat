package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ChatMapper;
import com.example.demo.model.Chat;
import com.example.demo.service.ChatService;
	
@Service
public class ChatServiceImpe implements ChatService{
	@Autowired
	ChatMapper chatmapper;
	
	
	@Override
	public void AddChat(Chat c) {
		
		chatmapper.addChat(c);
	}

	@Override
	public List<Chat> AllChat() {
		
		return chatmapper.selectAll();
	}

	@Override
	public void UpdateChat(Chat c) {
		
		List<Chat> l=chatmapper.selectById(c.getId());//使用輸入的ID調閱資料庫
		Chat chat=l.get(0);//來自於資料庫資料
		                                  /*
		                                  * c->輸入物件
		                                  * chat->資料庫的物件
		                                  */
		chat.setSubject(c.getSubject());
		chat.setContent(c.getContent());
		
		chatmapper.update(chat);
		
	}

	@Override
	public void DelectChat(int id) {
		chatmapper.deleteById(id);
		
	}

}
