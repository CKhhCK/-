package com.chenke.schoolmanger;

import com.chenke.schoolmanger.dao.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;

@SpringBootTest
class SchoolMangerApplicationTests {
    @Autowired
    JavaMailSender javaMailSender;
    @Test

    public void sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("这是一封测试邮件");
        message.setFrom("2084564636@qq.com");
        message.setTo("185976928@qq.com");
        message.setTo("1324547336@qq.com");
        message.setText("这是测试邮件的正文");
        message.setSentDate(new Date());
try{
    javaMailSender.send(message);
}
catch (Exception e){
    System.out.println("发送失败");
    return;
}
System.out.println("发送成功");
    }
    }


