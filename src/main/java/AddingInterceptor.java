public class AddingInterceptor implements RequestInterceptor{

    @Override
    public void onRequest(RequestContext requestContext) {
        requestContext.addWeatherData();
    }
}
