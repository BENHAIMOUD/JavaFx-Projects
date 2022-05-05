package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Created By Ayoub BENHAIMOUD");
        primaryStage.setScene(new Scene(root, 617, 466));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("Start Program");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("End Program !");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
