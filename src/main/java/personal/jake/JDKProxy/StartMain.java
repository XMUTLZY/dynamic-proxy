package personal.jake.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理类的实际调用，利用Proxy生成实际需要调用的类
 */
public class StartMain {
    public static void main(String[] args) {
        Person manImpl = new ManImpl();
        InvocationHandler invocationHandler = new ManImplProxy(manImpl);
        Person manProxy = (Person) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), manImpl.getClass().getInterfaces(), invocationHandler);
        manProxy.hello();
    }
}
