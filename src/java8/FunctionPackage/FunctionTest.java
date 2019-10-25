package java8.FunctionPackage;

import java.util.function.Function;

/**
 * @Description : Function接口测试
 * Created by WL on 2018/8/1
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = (i) -> {
            System.err.println("函数1");
            return i + 3;
        };// 函数1
        Function<Integer, Integer> function2 = (i) -> {
            System.err.println("函数2");
            return i + 4;
        };// 函数2
        Function<Integer, Integer> function3 = function2.compose(function1);// 得到一个函数3 他会先执行函数1再执行函数2
        System.err.println(function3.apply(2));
        Function<Integer, Integer> function4 = function2.andThen(function1);// 得到一个函数4 他会先执行函数2再执行函数1
        System.err.println(function4.apply(2));

        Function a = Function.identity();// 得到一个执行了apply()方法之后只会返回输入参数的函数对象。
        System.err.println(a.apply("sss"));
    }
}
