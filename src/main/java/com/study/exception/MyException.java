package com.study.exception;

public class MyException extends  Exception{
    String message;

    public MyException(String erroMessage){
        message=erroMessage;
    }
    public String getMessage(){
        return message;
    }
}
