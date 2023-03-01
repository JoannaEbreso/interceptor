public class LoggingInterceptor implements RequestInterceptor{
    @Override
    public void onRequest(RequestContext requestContext) {

        requestContext.logWeatherData();
    }
}
