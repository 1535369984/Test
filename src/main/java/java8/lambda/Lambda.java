package java8.lambda;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import test.User;

/**
 * @Description :
 * Created by WL on 2018/7/24
 */
public class Lambda {
    public static void main(String[] args) {
//        String str = "w";
        List<User> lists = new ArrayList<User>();
        for (int i = 1; i < 10; i++) {
            User list = new User();
            list.setName(String.valueOf(i));
            list.setAger(i);
            lists.add(list);
        }
        Arrays.asList(1, 2, 3, 4).forEach((Integer e) -> System.err.println(e));
//        lists.forEach(e -> {
//            if (e.getAger() == 5) {
//                System.err.println("hello" + str);
//            } else {
//                System.err.println(e.getName() + str);
//            }
//        });
//
//        lists.sort((e1, e2) -> {
//            int a = e1.getName().compareTo(e2.getName());
//            return -a;
//        });
        lists.forEach(e -> System.err.println(e));
//        // 流的API设计使用了管道（pipelines）模式。对流的一次操作会返回另一个流。
//        // 如同IO的API或者StringBuffer的append方法那样，
//        // 从而多个不同的操作可以在一个语句里串起来
        lists.stream().filter(e -> e.getAger() > 0).forEach(e -> System.err.println(e));
        lists.parallelStream().filter(e -> e.getAger() > 0).forEach(e -> System.err.println(e));// 指明流的多核并行处理
        lists.parallelStream().filter(e -> e.hashCode() > 100).collect(Collectors.toMap(e -> e, e -> 1));
//        Function<Integer, Integer> f1 = i -> i + 2;
//        System.err.println(f1.apply(1) + "===13245");

        Consumer<Integer> consumer = e -> System.err.println(e);
        consumer.accept(1);
//
//        // lambda表达式的应用场景
//
//        Runnable a = () ->
//                System.err.println("a");
//        Object b0 = a;
//
//
        Object b1 = (Runnable) () -> System.err.println("b");
//
//        //λ表达式的类型，叫做“目标类型（target type）”。
//        // λ表达式的目标类型是“函数接口（functional interface）”，
//        // 这是Java8新引入的概念。它的定义是：一个接口，
//        // 如果只有一个显式声明的抽象方法，那么它就是一个函数接口。
//        // 一般用@FunctionalInterface标注出来（也可以不标）。
        FunctionalInterface f = (a1, b) -> {
            System.err.println(a1 + b);
            return (a1 + b);
        };
//
        FunctionalInterface f1 = (a1, b) -> a1 + b;
        f1.ceshiyixia();
        System.err.println(f1.hashCode());
//
//        System.err.println(f.test(1, 2));
//        System.err.println(f1.test(1, 2));

        DefaultInterface d = (a) -> a.size();
        System.err.println(d.getSize(lists));
        d.test();
        d.test1();
    }

    //给出一个String类型的数组，
    public void distinctPrimary(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        List<Integer> r = l.stream()
                .map(e -> new Integer(e))
                .filter(e -> (e & 1) == 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctPrimary result is: " + r);
    }

    public void primaryOccurrence(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        Map<Integer, Integer> r = l.stream()
                .map(e -> new Integer(e))
                .collect(Collectors.groupingBy(p -> p, Collectors.summingInt(p -> 1)));
        System.out.println("primaryOccurrence result is: " + r);
    }

    //给出一个String类型的数组，求其中所有不重复素数的和
    public void distinctPrimarySum(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        int sum = l.stream()
                .map(e -> new Integer(e))
                .distinct()
                .reduce(0, (x, y) -> x + y); // equivalent to .sum()
        System.out.println("distinctPrimarySum result is: " + sum);
    }
}
