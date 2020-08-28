package com.udacity.joke.entity;

public class Dawg {

    private String message;
    private String status;

    public Dawg(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dawg{message=" + message + ", status=" + status + "}";
    }
}
