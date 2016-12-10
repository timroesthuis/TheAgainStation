import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class Controller {
    public Model model = new Model();

    ///// Initialization of all FXML stuff /////////////////////////////////////////////////////////////////////////////

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

    private void freezingTemperature() {
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
        brt_background.setVisible(false);
        brt_moon.setVisible(false);
        brt_cloudp1.setVisible(false);
        brt_cloudp2.setVisible(false);
        brt_cloudp3.setVisible(false);
    }

    private void cloudy() {
        brt_background.setVisible(false);
        brt_moon.setVisible(false);
        brt_cloudp1.setVisible(true);
        brt_cloudp2.setVisible(true);
        brt_cloudp3.setVisible(true);
    }

    private void night() {
        brt_background.setVisible(true);
        brt_moon.setVisible(true);
        brt_cloudp1.setVisible(false);
        brt_cloudp2.setVisible(false);
        brt_cloudp3.setVisible(false);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///// Updaters /////////////////////////////////////////////////////////////////////////////////////////////////////

    /* Update all */
    public void updateAll() {
        updateTemperature();
        updateHumidity();
        updateAirpressure();
        updateBrightness();
    }

    /* Temperature */
    private void updateTemperature() {
        int tmp = model.getTemperature();
        String tmp2 = Integer.toString(tmp);

        temperature.setText(tmp2 + " °C");

        if(tmp > 22) {hotTemperature();}
        else if(tmp > 12) {medTemperature();}
        else if(tmp > 0) {coldTemperature();}
        else {freezingTemperature();}
    }

    /* Humidity */
    private void updateHumidity() {
        int hum = model.getHumidity();

        humidity.setText(hum + " %");

        if(hum > 67) {reallyHumid();}
        else if(hum > 33) {humid();}
        else {notHumid();}
    }

    /* Air Pressure */
    private void updateAirpressure() {
        int air = model.getAirPressure();

        airPressure.setText(air + " hPa");

        if(air > 800) {highPressure();}
        else if(air > 550) {mediumPressure();}
        else {lowPressure();}
    }

    /* Brightness */
    private void updateBrightness() {
        int brt = model.getBrightness();

        brightness.setText(brt + " Lux");

        if(brt > 720) {day();}
        else if(brt > 360) {cloudy();}
        else {night();}
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
