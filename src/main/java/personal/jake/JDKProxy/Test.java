package personal.jake.JDKProxy;

import personal.jake.Boy;
import personal.jake.Girl;
import personal.jake.Person;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class Test {
    public static void main(String[] args) {
        Person boy = new Boy();
        InvocationHandler invocationHandler = new BoyProxy(boy);
        Person person = (Person) Proxy.newProxyInstance(boy.getClass().getClassLoader(), boy.getClass().getInterfaces(), invocationHandler);
        person.say();

        Person girl = new Girl();
        InvocationHandler invocationHandler1 = new BoyProxy(girl);
        Person person1 = (Person) Proxy.newProxyInstance(girl.getClass().getClassLoader(), girl.getClass().getInterfaces(), invocationHandler1);
        person1.say();
    }
}
