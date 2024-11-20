package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Chat;

@SpringBootTest
public class ChatMapperTest {
	@Autowired
	ChatMapper chatmapper;
	
	@Test
	public void cxtest()
	{
		//System.out.println(chatmapper.selectAll());
		//System.out.println(chatmapper.selectById(1));
		//System.out.println(chatmapper.selectByIdRange(1, 3));
		
		//List<Chat> l=chatmapper.selectById(1);
		//Chat c=l.get(0);
		//c.setName("留言者1");
		//c.setSubject("主旨1");
		//chatmapper.update(c);
		//chatmapper.deleteById(3);
		
		
		System.out.println("success");
	}
}
