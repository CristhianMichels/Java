package evenorodd.ex018;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 199, 152);
        stage.setTitle("Even or Odd");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
