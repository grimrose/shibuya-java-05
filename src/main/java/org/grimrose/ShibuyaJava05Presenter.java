package org.grimrose;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.inject.Inject;
import java.text.DateFormat;
import java.util.Date;

public class ShibuyaJava05Presenter {

    public ObservableList<MessageRow> messageRowList = FXCollections.observableArrayList();

    @FXML
    TableView<MessageRow> table;

    @FXML
    TableColumn<MessageRow, String> submitAtColumn;

    @FXML
    TableColumn<MessageRow, String> messageColumn;


    @FXML
    void initialize() {
        table.setEditable(false);
        submitAtColumn.setCellValueFactory(new PropertyValueFactory<MessageRow, String>("submitAt"));
        messageColumn.setCellValueFactory(new PropertyValueFactory<MessageRow, String>("message"));

        Message message = new Message(new Date(), "ようこそ");

        String submitAt = DateFormat.getDateTimeInstance().format(message.getSubmitAt());
        MessageRow row = new MessageRow(submitAt, message.getMessage());

        messageRowList.add(row);

        table.setItems(messageRowList);
    }

    @FXML
    private TextField name;

    @Inject
    ShibuyaJava05Service shibuyaJava05Service;

    public void sayHello() {
        // Watch out! this code is executed inside the UI thread.
        shibuyaJava05Service.sayHello(name.getText());
    }
}
