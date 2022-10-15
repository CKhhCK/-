package com.chenke.schoolmanger.controller;

import com.chenke.schoolmanger.dao.Service;
import com.chenke.schoolmanger.enity.Message;
import com.chenke.schoolmanger.enity.Messageresult;
import com.chenke.schoolmanger.enity.Student;
import com.chenke.schoolmanger.enity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class Hellow {
    @Autowired
    Service service;
    @Autowired
    JavaMailSender javaMailSender;
    @GetMapping("/bbb")
    public List<Message> Test01(String index, String count){
        return service.GetMessage(Integer.parseInt(index),Integer.parseInt(count));
    }
    @GetMapping("/getresult")
    public List<Messageresult> Getresult(String message_id){

        return service.GetMessagereult(Integer.parseInt(message_id));
    }

    @GetMapping("/aaa")
    public String Test02(){
        return "modify_login-master/html/manage";
    }

    @PostMapping("/Addmessage")
    public  boolean Addmessage(@RequestBody Message message){
        System.out.println(message.Isrightmessage());
        if(!message.Isrightmessage())
            return false;


        System.out.println(message);
        try{
            service.Addmessages(message);
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;

    }

    @PostMapping("/sendmassage")
    public Boolean Sendmassage(@RequestBody Message message){
        System.out.println(message);
        Messageresult messageresult = new Messageresult();
        messageresult.setMessage_id(message.getId());
        messageresult.setMessage_name(message.getMessage_name());
        messageresult.setMessage_account(message.getMessage_account());
        Date date = new Date();
        SimpleDateFormat mat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        messageresult.setDate_time(mat.format(date));

        SimpleMailMessage messages = new SimpleMailMessage();
        messages.setSubject(message.getMessage_name());
        messages.setFrom("2084564636@qq.com");
        messages.setTo(message.getMessage_account());


        messages.setSentDate(new Date());
        messages.setText(message.getMessage_content());
        try{
            javaMailSender.send(messages);
        }
        catch (Exception e){
            System.out.println("发送失败");
            messageresult.setResult(false);
            service.Addmessageresult(messageresult);
            return false;
        }
        messageresult.setResult(true);
        service.Addmessageresult(messageresult);
        return true;
    }

    @PostMapping("/getuser")
    public Boolean dologin(@RequestBody User user){
        System.out.println(user);
        System.out.println(service.GetUser(user));
        User result;

        try{
            result=service.GetUser(user);
        }
        catch (Exception e){
            return false;
        }
        System.out.println(result);
        if(result==null)
            return false;
        return true;
    }
}
