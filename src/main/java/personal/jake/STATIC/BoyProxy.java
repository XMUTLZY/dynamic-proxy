package personal.jake.STATIC;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class BoyProxy implements Person {
    private Boy boy;

    public BoyProxy(Boy boy) {
        this.boy = boy;
    }

    @Override
    public void say() {
        System.out.println("boy begin say:");
        boy.say();
        System.out.println("end");
    }
}
