package personal.jake;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class Girl implements Person {
    public Girl() {
    }

    @Override
    public void say() {
        System.out.println("hello, i am girl");
    }

    @Override
    public void run() {
        System.out.println("girl run");
    }
}
