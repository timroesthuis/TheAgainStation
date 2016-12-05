import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) throws Exception {
        Parent rootPane = FXMLLoader.load(getClass().getResource("View.fxml"));
        myStage.setTitle("The AgainStation v0.1");
        myStage.setScene(new Scene(rootPane));
        myStage.show();
    }
}
