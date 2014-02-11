package org.grimrose;

import com.airhacks.afterburner.injection.InjectionProvider;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShibuyaJava05Main extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        ShibuyaJava05View view = new ShibuyaJava05View();
        Scene scene = new Scene(view.getView(), 390, 80);
        stage.setTitle("shibuyaJava05");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        InjectionProvider.forgetAll();
    }
}
