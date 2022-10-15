package com.chenke.schoolmanger.dao;

import com.chenke.schoolmanger.enity.Message;
import com.chenke.schoolmanger.enity.Messageresult;
import com.chenke.schoolmanger.enity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Service {
    @Select("SELECT * FROM test.message_send limit #{index},#{count};")
    List<Message> GetMessage(@Param("index") int index, @Param("count")int count);

    @Select("insert into message_send (id,message_name,message_way,message_type,message_creater,message_accept,message_account,message_content) values(null,#{message_name},#{message_way},#{message_type},#{message_creater},#{message_accept},#{message_account},#{message_content});")
    void Addmessages(Message message);

    @Select("insert into messageresult (id,date_time,message_name,message_account,result,message_id) values(null,#{date_time},#{message_name},#{message_account},#{result},#{message_id});")
    void Addmessageresult(Messageresult messageresult);

    @Select("SELECT * FROM test.messageresult where message_id=#{message_id};")
    List<Messageresult> GetMessagereult(int id);

    @Select("SELECT * FROM test.user where username=#{username} and password=#{password};")
    User GetUser(User user);



}
