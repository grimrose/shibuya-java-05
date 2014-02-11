package org.grimrose;


import java.util.Date;

public class Message {

    private Date submitAt;
    private String message;

    public Message(Date submitAt, String message) {
        this.submitAt = submitAt;
        this.message = message;
    }

    public Date getSubmitAt() {
        return submitAt;
    }


    public String getMessage() {
        return message;
    }

}
