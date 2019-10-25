package test;

/**
 * @Description :
 * Created by WL on 2017/12/1
 */
public class Super {
    String name;

    public Super() {
        System.err.println("super");
    }

    public Super(String string) {
        System.err.println("super string");
    }

    public void say() {
        System.err.println("say super");
    }

    public void say(String s) {
        System.err.println("say super String");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        Sub sub2 = new Sub("");
        sub.say();
        sub.say("");
        sub2.say();
        sub2.say("");

        Super s = new Sub();
        Super s1 = new Sub("");
        s.say();
        s.say("");
        s1.say();
        s1.say("");
    }
}

class Sub extends Super {

    public Sub() {
        System.err.println("sub");
    }

    public Sub(String string) {
        System.err.println("sub string");
    }

    @Override
    public void say() {
        System.err.println("say sub");
    }

    @Override
    public void say(String s) {
        System.err.println("say sub string");
    }

    public void test() {

    }
}