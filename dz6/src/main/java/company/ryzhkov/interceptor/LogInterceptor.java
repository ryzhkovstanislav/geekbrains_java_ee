package company.ryzhkov.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

//@Interceptor
public class LogInterceptor {

    private static final Logger LOGGER = Logger.getLogger(LogInterceptor.class.getSimpleName());

    @AroundInvoke
    public Object addLog(InvocationContext context) throws Exception {
        LOGGER.info(context.getMethod().getName());
        final Object result = context.proceed();
        return result;
    }
}
