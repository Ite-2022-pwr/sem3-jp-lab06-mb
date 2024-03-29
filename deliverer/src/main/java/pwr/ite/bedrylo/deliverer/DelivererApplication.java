package pwr.ite.bedrylo.deliverer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DelivererApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DelivererApplication.class.getResource("deliverer-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 240);
        stage.setTitle("Deliverer!");
        stage.setScene(scene);
        stage.show();
    }
}