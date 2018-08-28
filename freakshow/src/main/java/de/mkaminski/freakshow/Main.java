package de.mkaminski.freakshow;

import de.mkaminski.freakshow.controller.ViewController;
import de.mkaminski.freakshow.model.DataModel;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {


        /**
         *
         * Main-Methode der Main-Klasse. führt für JavaFX die Methode "launch(args)" aus.
         *
         * @param args werden ignoriert Hier nur für die "launch"-Methode von Nutzen.
         */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        DataModel dataModel = new DataModel(stage);

        ViewController eingabeVC = new ViewController(dataModel);
        eingabeVC.show();
    }
}