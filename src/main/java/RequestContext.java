public class RequestContext {
    private WeatherData weatherData;

    public RequestContext(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void logWeatherData(){
        weatherData.logData();
    }

    public void addWeatherData(){
        weatherData.addData();
    }

}
