package personal.jake;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class Boy implements Person {
    public Boy() {
    }

    @Override
    public void say() {
        System.out.println("hello, i am boy");
    }

    @Override
    public void run() {
        System.out.println("boy run");
    }

    public void test() {
        System.out.println("hello, i am boy test");
    }
}
