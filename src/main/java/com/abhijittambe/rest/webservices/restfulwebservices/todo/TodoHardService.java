package com.abhijittambe.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class TodoHardService {

	private static List<Todo> todos = new ArrayList();
	private static Long idCounter=0L; 
	static {
		todos.add(new Todo(++idCounter,"a","b",new Date(),false));
		todos.add(new Todo(++idCounter,"a1","b1",new Date(),false));
		todos.add(new Todo(++idCounter,"a2","b2",new Date(),false));
		todos.add(new Todo(++idCounter,"a3","b3",new Date(),true));
		todos.add(new Todo(++idCounter,"a4","b4",new Date(),false));
	}
	
	
	public List<Todo> findAll() {
		return todos;
	}
	
	
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1||todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo =findById(id);
		if(todo==null) return null;
		if(todos.remove(todo)) {
		return todo;}
		return null;
	}
	
	public Todo findById(long id) {
		// TODO Auto-generated method stub
		
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
	
}
