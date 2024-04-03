package com.prasad.practice.service;

import com.prasad.practice.model.Todo;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class TodoService {
        private static Set<Todo> todos=new HashSet<>();
        private int todoCount=3;
        static {
            todos.add(new Todo(1,"Admin","Learn Spring MVC",new Date(),false));
            todos.add(new Todo(2,"Admin","Learn Struts",new Date(),false));
            todos.add(new Todo(3,"Admin","Learn Hibernate",new Date(),false));
        }
        public List<Todo> retrieveTodos(String user){
            List<Todo>filteredTodos=new ArrayList<Todo>();
            for (Todo todo :todos){
                    if (todo.getUser().equals(user))
                        filteredTodos.add(todo);
            }
            return filteredTodos;
        }
        public Todo retrieveTodo(int id){
            for (Todo todo:todos){
                if (todo.getId()==id)
                    return todo;
            }
            return null;
        }
        public void updateTodo(Todo todo){
            todos.remove(todo);
            todos.add(todo);
        }
        public void addTodo(String name,String desc,Date targetDate,boolean isDone){
        todos.add(new Todo(++todoCount,name,desc,targetDate,isDone));
        }
        public void deleteTodo(int id){
            Iterator<Todo> iterator=todos.iterator();
            while (iterator.hasNext()){
                Todo todo=iterator.next();
                if (todo.getId()==id){
                    iterator.remove();
                }
            }
        }
}
