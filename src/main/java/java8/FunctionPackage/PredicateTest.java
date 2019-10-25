package java8.FunctionPackage;

import java.util.function.Predicate;

/**
 * @Description :
 * Created by WL on 2018/8/2
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> pre1 = e -> (e & 1) == 1; // 函数一  测试一个数是奇数
        Predicate<Integer> pre2 = e -> e > 10;// 函数二 判断数字是否大于10

        pre1.negate();// 返回一个执行 非 操作的Predicate对象  测试一个数是偶数






    }
}