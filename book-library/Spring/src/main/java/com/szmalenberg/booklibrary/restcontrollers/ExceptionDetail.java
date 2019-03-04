package com.szmalenberg.booklibrary.restcontrollers;

public class ExceptionDetail {
    private String exceptionName;
    private String message;

    public ExceptionDetail(String exceptionName, String message) {
        this.exceptionName = exceptionName;
        this.message = message;
    }

    public String getExceptionName() {
        return exceptionName;
    }

    public String getMessage() {
        return message;
    }

    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
