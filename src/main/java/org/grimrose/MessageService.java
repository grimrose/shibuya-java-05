package org.grimrose;


import java.util.Date;

public class MessageService {

    public Message create(String inputMessage) {
        return new Message(new Date(),inputMessage);
    }

}
