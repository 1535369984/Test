package java8.lambda;

/**
 * @Description :
 * Created by WL on 2018/7/25
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    int test(int a, int b);

    default void ceshiyixia() {
        System.err.println("FunctionalInterface");
    }
}
