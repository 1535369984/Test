/**
 * @Description :
 * Created by WL on 2018/1/15
 */
public class InterfaceTest extends B implements Inter1, Inter2 {
    public static void main(String[] args) {
        InterfaceTest a = new InterfaceTest();
        System.err.println(a.test() + ":" + a.test2());
    }

    @Override
    public String test2() {
        return "test2";
    }
}

class B {
    public String test() {
        return "lei";
    }
}