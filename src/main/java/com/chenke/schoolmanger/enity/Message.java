package com.chenke.schoolmanger.enity;

import java.util.Collection;

public class Message{
    private int id;
    private String message_name;
    private String message_way;
    private String message_type;
    private String message_creater;
    private String message_accept;
    private String message_account;
    private String message_content;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage_name() {
        return message_name;
    }

    public void setMessage_name(String message_name) {
        this.message_name = message_name;
    }

    public String getMessage_way() {
        return message_way;
    }

    public void setMessage_way(String message_way) {
        this.message_way = message_way;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getMessage_creater() {
        return message_creater;
    }

    public String getMessage_account() {
        return message_account;
    }

    public void setMessage_account(String message_account) {
        this.message_account = message_account;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public void setMessage_creater(String message_creater) {
        this.message_creater = message_creater;
    }

    public String getMessage_accept() {
        return message_accept;
    }

    public void setMessage_accept(String message_accept) {
        this.message_accept = message_accept;
    }

    public boolean Isrightmessage(){
        if(message_name==null||message_name.equals(""))
            return false;
        if(message_way==null||message_way.equals(""))
            return false;
        if(message_type==null||message_type.equals(""))
            return false;
        if(message_creater==null||message_creater.equals(""))
            return false;
        if(message_accept==null||message_accept.equals(""))
            return false;
        if(message_account==null||message_account.equals(""))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message_name='" + message_name + '\'' +
                ", message_way='" + message_way + '\'' +
                ", message_type='" + message_type + '\'' +
                ", message_creater='" + message_creater + '\'' +
                ", message_accept='" + message_accept + '\'' +
                ", message_account='" + message_account + '\'' +
                ", message_content='" + message_content + '\'' +
                '}';
    }
}
