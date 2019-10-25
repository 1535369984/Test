package java8.lambda;

import java.util.List;

/**
 * @Description :
 * Created by WL on 2018/7/24
 */
@java.lang.FunctionalInterface
public interface DefaultInterface {
    int getSize(List a);
    boolean equals(Object var1);
    int hashCode();
    String toString();
    default void test() {
        System.err.println("DefaultInterface");
    }
    default void test1(){System.err.println("一个接口现在可以拥有多个默认方法");};
}

abstract class test0 implements DefaultInterface {

}

abstract class test implements DefaultInterface {
    @Override
    public void test() {
        System.err.println("test");
    }
}