package com.library;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        String javaVersion = System.getProperty("java.version");
        //javafx is runnig on top of java
        String javaFXVersion = System.getProperty("javafx.version");
        String message = String.format("javafx %s is runnig on top of java %s", javaFXVersion, javaVersion);

        Scene scene = new Scene( new StackPane( new Label(message) ), 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
