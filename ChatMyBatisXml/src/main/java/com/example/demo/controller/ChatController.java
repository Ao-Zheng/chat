package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Chat;
import com.example.demo.service.impl.ChatServiceImpe;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin
@RequestMapping("chat")
public class ChatController {
	
	@Autowired
	ChatServiceImpe chatserviceimpl;
	
	@GetMapping("AllChat")
	public List<Chat> allChat()
	{
		return chatserviceimpl.AllChat();
	}
	
	@PostMapping("AddChat")
	public String addChat(@RequestBody Chat c)
	{
	    chatserviceimpl.AddChat(c);
	    
	    return "addSuccess";
	}
	
	@PutMapping("UpdateChat")
	public String updateChat(@RequestBody Chat c)
	{
		chatserviceimpl.UpdateChat(c);
		return "updateSuccess";
	}
	
	@DeleteMapping("DeleteChat/{id}")
	public String delete(@PathVariable("id")int id)
	{
		chatserviceimpl.DelectChat(id);
		return"deleteSuccess";
	}
	
}
