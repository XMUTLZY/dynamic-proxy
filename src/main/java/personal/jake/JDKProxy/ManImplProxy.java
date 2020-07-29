package personal.jake.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ManImpl的代理类，实现InvocationHandler接口
 */
public class ManImplProxy implements InvocationHandler {
    private Person man;

    public ManImplProxy(Person man) {
        this.man = man;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("man begin");
        Object invoke = method.invoke(man, args);
        System.out.println("man end");
        return invoke;
    }
}
