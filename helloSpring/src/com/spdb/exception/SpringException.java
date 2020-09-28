package com.spdb.exception;

/**
 * @Author Yang Qi
 * @Date 2020/8/18 13:37
 */
public class SpringException extends RuntimeException{

    private String exceptionMsg;

    public SpringException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
