package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        primaryStage.setTitle("Equipment Loan System");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    } // load the main screen for the system

    public static void main(String[] args) {
        launch(args);
    }
}
