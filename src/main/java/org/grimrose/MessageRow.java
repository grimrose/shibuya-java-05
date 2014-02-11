package org.grimrose;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MessageRow {

    private StringProperty submitAt = new SimpleStringProperty();
    private StringProperty message = new SimpleStringProperty();

    public MessageRow(String submitAt, String message) {
        setSubmitAt(submitAt);
        setMessage(message);
    }

    public StringProperty submitAtProperty() {
        return submitAt;
    }

    public StringProperty messageProperty() {
        return message;
    }

    public String getSubmitAt() {
        return submitAt.get();
    }

    public String getMessage() {
        return message.get();
    }

    public void setSubmitAt(String submitAt) {
        this.submitAt.set(submitAt);
    }

    public void setMessage(String message) {
        this.message.set(message);
    }

}
