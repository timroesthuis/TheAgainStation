import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {
//    public Main() {
//        model = new Model();
//    }

    public static void main(String[] args) {
        launch(args);

<<<<<<< HEAD
        Controller controller = new Controller();

        System.out.println("stage\n");

        controller.model.setTemperature(7);
        controller.updateAll();

        System.out.println("update\n");
=======
        Model model = new Model();

        model.setTemperature(7);
>>>>>>> ef797a600b2d248c4a12b08a9bb0d481a3063d85
    }

    public void start(Stage myStage) throws Exception {
        Parent rootPane = FXMLLoader.load(getClass().getResource("View rev 3.fxml"));
        myStage.setTitle("The AgainStation v0.1");
        myStage.setScene(new Scene(rootPane));
        myStage.show();
    }
}
