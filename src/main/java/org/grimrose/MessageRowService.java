package org.grimrose;


import java.text.DateFormat;

public class MessageRowService {

    public MessageRow create(Message message) {
        String submitAt = DateFormat.getDateTimeInstance().format(message.getSubmitAt());
        return new MessageRow(submitAt, message.getMessage());
    }

}
