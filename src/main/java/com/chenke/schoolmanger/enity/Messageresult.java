package com.chenke.schoolmanger.enity;

public class Messageresult {
    private int id;
    private String message_name;
    private String date_time;
    private String message_account;
    private Boolean result;
    private int message_id;

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

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getMessage_account() {
        return message_account;
    }

    public void setMessage_account(String message_account) {
        this.message_account = message_account;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    @Override
    public String toString() {
        return "Messageresult{" +
                "id=" + id +
                ", message_name='" + message_name + '\'' +
                ", date_time='" + date_time + '\'' +
                ", message_account='" + message_account + '\'' +
                ", result=" + result +
                ", message_id=" + message_id +
                '}';
    }


}
