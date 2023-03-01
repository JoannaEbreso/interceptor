import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    List<RequestInterceptor> interceptors = new ArrayList<>();

    public void registerRequestInterceptor(RequestInterceptor interceptor){
        interceptors.add(interceptor);
    }

    public void removeClientRequestInterceptor(RequestInterceptor interceptor){
        interceptors.remove(interceptor);
    }

    public void dispatchClientRequestInterceptor(RequestContext context){
        for (RequestInterceptor interceptor: interceptors){
            interceptor.onRequest(context);
        }
    }
}
