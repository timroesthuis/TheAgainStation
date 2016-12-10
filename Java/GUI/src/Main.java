import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);

        Controller controller = new Controller();

        System.out.println("stage\n");

        controller.model.setTemperature(7);
        controller.updateAll();

        System.out.println("update\n");
    }

    public void start(Stage myStage) throws Exception {
        Parent rootPane = FXMLLoader.load(getClass().getResource("View rev 3.fxml"));
        myStage.setTitle("The AgainStation v0.1");
        myStage.setScene(new Scene(rootPane));
        myStage.show();
    }
}
