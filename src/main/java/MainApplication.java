public class MainApplication {

    public static void main(String[] args){

        LoggingInterceptor newLoggingInterceptor = new LoggingInterceptor();

        WeatherData weatherData = new WeatherData();
        weatherData.registerInterceptor(newLoggingInterceptor);

        weatherData.setMeasurements(20,25,20);

    }
}
