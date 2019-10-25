package java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import test.User;

/**
 * @Description :
 * Created by WL on 2018/7/30
 */
public class MethodReference {
    public static void main(String[] args) {
        //c1 与 c2 是一样的（静态方法引用）
        Comparator<Integer> c2 = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> c1 = Integer::compare;

        List<User> lists = new ArrayList<User>();
        for (int i = 1; i < 10; i++) {
            User list = new User();
            list.setName(String.valueOf(i));
            list.setAger(i);
            lists.add(list);
        }

        //下面两句是一样的（实例方法引用1）
        lists.forEach(e -> System.out.println(e));
        lists.forEach(System.out::println);

        //下面两句是一样的（实例方法引用2）
        lists.forEach(person -> person.getAger());
        lists.forEach(User::getAger);

        //下面两句是一样的（构造器引用）
        lists.stream().map(s -> new Integer(s.getAger()));

    }
}
