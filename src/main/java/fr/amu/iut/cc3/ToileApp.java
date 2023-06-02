package fr.amu.iut.cc3;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToileApp extends Application {

    public static void main(String[] args) {


        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("toile.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Résultats aux différentes compétences du BUT");
        primaryStage.setScene( new Scene(root) );
        primaryStage.show();
    }

}

