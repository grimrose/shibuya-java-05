package org.grimrose;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.inject.Inject;

public class ShibuyaJava05Presenter {

    public ObservableList<MessageRow> messageRowList = FXCollections.observableArrayList();

    @FXML
    TableView<MessageRow> table;

    @FXML
    TableColumn<MessageRow, String> submitAtColumn;

    @FXML
    TableColumn<MessageRow, String> messageColumn;

    @Inject
    MessageRowService messageRowService;

    @Inject
    MessageService messageService;

    @FXML
    void initialize() {
        table.setEditable(false);
        submitAtColumn.setCellValueFactory(new PropertyValueFactory<MessageRow, String>("submitAt"));
        messageColumn.setCellValueFactory(new PropertyValueFactory<MessageRow, String>("message"));

        Message message = messageService.create("ようこそ");
        MessageRow row = messageRowService.create(message);

        messageRowList.add(row);

        table.setItems(messageRowList);
    }

    @FXML
    private TextField inputMessage;

    public void submitMessage(ActionEvent event) {
        ObservableList<MessageRow> currentList = table.getItems();

        Message message = messageService.create(inputMessage.getText());
        MessageRow row = messageRowService.create(message);

        currentList.add(row);
        inputMessage.setText("");
    }

}
