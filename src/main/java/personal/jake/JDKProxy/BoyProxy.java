package personal.jake.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class BoyProxy implements InvocationHandler {
    private Object object;

    public BoyProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理前");
        Object result = method.invoke(object, args);
        System.out.println("jdk动态代理后");
        return result;
    }
}
