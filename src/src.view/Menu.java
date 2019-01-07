package src.view;

import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Menu extends Application
{
    public void show(String[] args)
    {
        launch(args);
    }
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("ClickMaster Mainmenu");

        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(0, 10, 0, 10));

        layout.add(new Label("Welcome to ClickMaster"),5,5);

        primaryStage.setScene(new Scene(layout, 300, 250));
        primaryStage.show();
    }
}