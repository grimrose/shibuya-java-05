package org.grimrose;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.inject.Inject;

public class ShibuyaJava05Presenter {
    @FXML
    private TextField name;

    @Inject
    ShibuyaJava05Service shibuyaJava05Service;

    public void sayHello() {
        // Watch out! this code is executed inside the UI thread.
        shibuyaJava05Service.sayHello(name.getText());
    }
}
