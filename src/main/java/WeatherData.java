public class WeatherData {

    private int temperature;
    private int humidity;
    private int pressure;

    private RequestContext requestContext = new RequestContext(this);

    private Dispatcher dispatcher = new Dispatcher();

    public void setMeasurements(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        dispatcher.dispatchClientRequestInterceptor(this.requestContext);
    }

    public void registerInterceptor(RequestInterceptor interceptor){
        dispatcher.registerRequestInterceptor(interceptor);
    }

    public void logData(){
        System.out.println("Weather Data Details are: ");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    public void addData(){
        System.out.println(temperature + humidity + pressure);
    }


}
