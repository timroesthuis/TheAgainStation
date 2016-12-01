import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class Controller {
    public Model model;

    public Controller() {
        model = new Model();
    }

    ///// Initialisation of all FXML stuff /////////////////////////////////////////////////////////////////////////////

    /* Temperature */
    @FXML
    private Text temperature = new Text();
    @FXML
    private Circle tmp_base = new Circle();
    @FXML
    private Rectangle tmp_cold = new Rectangle();
    @FXML
    private Rectangle tmp_med = new Rectangle();
    @FXML
    private Rectangle tmp_hot = new Rectangle();

    /* Humidity */
    @FXML
    private Text humidity = new Text();
    @FXML
    private Circle hum_leftCircle = new Circle();
    @FXML
    private Rectangle hum_leftRectangle = new Rectangle();
    @FXML
    private Circle hum_middleCircle = new Circle();
    @FXML
    private Rectangle hum_middleRectangle = new Rectangle();
    @FXML
    private Circle hum_rightCircle = new Circle();
    @FXML
    private Rectangle hum_rightRectangle = new Rectangle();

    /* Air Pressure */
    @FXML
    private Text airPressure = new Text();
    @FXML
    private Rectangle air_low = new Rectangle();
    @FXML
    private Rectangle air_medium = new Rectangle();
    @FXML
    private Rectangle air_high = new Rectangle();

    /* Brightness */
    @FXML
    private Text brightness = new Text();
    @FXML
    private Rectangle brt_background = new Rectangle();
    @FXML
    private Circle brt_moon = new Circle();
    @FXML
    private Circle brt_cloudp1 = new Circle();
    @FXML
    private Circle brt_cloudp2 = new Circle();
    @FXML
    private Circle brt_cloudp3 = new Circle();

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///// Setters //////////////////////////////////////////////////////////////////////////////////////////////////////

    /* Temperature */
    public void setTemperature(int tmp) {
        temperature.setText(tmp + " °C");

        if(tmp > 22) {}
        else if( tmp > 12) {}
        else if(tmp > 0) {}
        else {}

    }

    /* Humidity */
    public void setHumidity(int hum) {
        humidity.setText(hum + " %");
    }

    /* Air Pressure */
    public void setAirpressure(int air) {
        airPressure.setText(air + " hPa");
    }

    /* Brightness */
    public void setBrightness(int brt) {
        brightness.setText(brt + " Lux");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///// Icon setters /////////////////////////////////////////////////////////////////////////////////////////////////

    /* Temperature */
    private void hotTemperature() {
        tmp_hot.setVisible(true);
        tmp_med.setVisible(false);
        tmp_cold.setVisible(false);
        tmp_base.setFill(Color.RED);
    }

    private void medTemperature() {
        tmp_hot.setVisible(false);
        tmp_med.setVisible(true);
        tmp_cold.setVisible(false);
        tmp_base.setFill(Color.RED);
    }

    private void coldTemperature() {
        tmp_hot.setVisible(false);
        tmp_med.setVisible(false);
        tmp_cold.setVisible(true);
        tmp_base.setFill(Color.RED);
    }

    private void freezingTemerature() {
        tmp_hot.setVisible(false);
        tmp_med.setVisible(false);
        tmp_cold.setVisible(false);
        tmp_base.setFill(Color.BLUE);
    }

    /* Humidity */
    private void reallyHumid(){
        hum_leftCircle.setVisible(true);
        hum_leftRectangle.setVisible(true);
        hum_middleCircle.setVisible(true);
        hum_middleRectangle.setVisible(true);
        hum_rightCircle.setVisible(true);
        hum_rightRectangle.setVisible(true);
    }

    private void humid(){
        hum_leftCircle.setVisible(true);
        hum_leftRectangle.setVisible(true);
        hum_middleCircle.setVisible(false);
        hum_middleRectangle.setVisible(false);
        hum_rightCircle.setVisible(true);
        hum_rightRectangle.setVisible(true);
    }

    private void notHumid(){
        hum_leftCircle.setVisible(false);
        hum_leftRectangle.setVisible(false);
        hum_middleCircle.setVisible(true);
        hum_middleRectangle.setVisible(true);
        hum_rightCircle.setVisible(false);
        hum_rightRectangle.setVisible(false);
    }

    /* Air Pressure */
    private void highPressure() {
        air_high.setVisible(true);
        air_medium.setVisible(false);
        air_low.setVisible(false);
    }

    private void mediumPressure() {
        air_high.setVisible(false);
        air_medium.setVisible(true);
        air_low.setVisible(false);
    }

    private void lowPressure() {
        air_high.setVisible(false);
        air_medium.setVisible(false);
        air_low.setVisible(true);
    }

    /* Brightness */
    private void day() {

    }

    private void cloudy() {

    }

    private void night() {

    }
}
