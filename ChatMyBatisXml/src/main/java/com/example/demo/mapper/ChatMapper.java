package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Chat;



@Mapper
public interface ChatMapper {
	void addChat(Chat c);
	List<Chat> selectAll();
	List<Chat> selectById(int id);
	List<Chat> selectByIdRange(int start,int end);
	void update(Chat c);
	void deleteById(int id);

	
	
}