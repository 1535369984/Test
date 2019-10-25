package java8.FunctionPackage;

import java.util.function.Consumer;

/**
 * @Description :
 * Created by WL on 2018/8/2
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = e -> System.err.println("函数一" + e);// 函数一
        consumer1.accept(10);
        Consumer<Integer> consumer2 = e -> System.err.println("函数二" + e);// 函数二

        Consumer<Integer> consumer3 = consumer1.andThen(consumer2);// 函数三  函数三先执行函数一再执行函数二
        consumer3.accept(9);
    }
}
