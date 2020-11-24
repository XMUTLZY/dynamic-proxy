package personal.jake.STATIC;

import personal.jake.Boy;
import personal.jake.Girl;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class Test {
    public static void main(String[] args) {
        new BoyProxy(new Boy()).say();
        new GirlProxy(new Girl()).say();
    }
}
