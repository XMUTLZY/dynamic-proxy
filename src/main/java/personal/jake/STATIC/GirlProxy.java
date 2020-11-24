package personal.jake.STATIC;

/**
 * @author jake.lin
 * @date 2020/11/24
 */
public class GirlProxy implements Person {
    private Girl girl;

    public GirlProxy(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void say() {
        System.out.println("girl begin say:");
        girl.say();
        System.out.println("end");
    }
}
