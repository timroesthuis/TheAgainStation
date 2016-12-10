public class Model {
    private int temperature = 18;
    private int humidity = 50;
    private int airPressure = 500;
    private int brightness = 500;

    ///// Setters //////////////////////////////////////////////////////////////////////////////////////////////////////

    /* Temperature */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /* Humidity */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /* Air Pressure */
    public void setAirpressure(int airPressure) {
        this.airPressure = airPressure;
    }

    /* Brightness */
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///// Getters //////////////////////////////////////////////////////////////////////////////////////////////////////

    /* Temperature */
    public int getTemperature() {
        return temperature;
    }

    /* Humidity */
    public int getHumidity() {
        return humidity;
    }

    /* Air Pressure */
    public int getAirPressure() {
        return airPressure;
    }

    /* Brightness */
    public int getBrightness() {
        return brightness;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
