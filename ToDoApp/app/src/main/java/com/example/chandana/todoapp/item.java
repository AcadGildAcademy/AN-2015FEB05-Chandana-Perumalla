package com.example.chandana.todoapp;

/**
 * Created by Chandana on 25-03-2015.
 */
public class item {
    private String todo_title;
    private String todo_description;
    private String todo_date;
    private boolean todo_action_status;

    public item(String todo_title, String todo_description, String todo_date, boolean todo_action_status){
        this.todo_title = todo_title;
        this.todo_description = todo_description;
        this.todo_date = todo_date;
        this.todo_action_status = todo_action_status;
    }
    public String getTodo_title(){
        return this.todo_title;
    }
    public void setTodo_title(String todo_title){
        this.todo_title = todo_title;
    }
    public String getTodo_description(){
        return this.todo_description;
    }
    public void setTodo_description(String todo_description){
        this.todo_description = todo_description;
    }
    public String getTodo_date(){
        return this.todo_date;
    }

    public void setTodo_date(String todo_date){
        this.todo_date = todo_date;
    }
    public boolean getTodo_action_status(){
        return this.todo_action_status;
    }
    public void setTodo_action_status(boolean todo_action_status){
        this.todo_action_status = todo_action_status;
    }
}
