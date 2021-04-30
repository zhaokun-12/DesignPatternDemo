package com.kun.chainResponsibility;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/30
 * @Version 1.0
 **/
public class Request {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Request{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
