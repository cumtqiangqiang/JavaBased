package com.cn.exception;

/**
 * 自定义异常类
 */
public class LoginException extends Exception {

    public LoginException() {
    }

    public LoginException (String msg){

        super(msg);
    }

}
