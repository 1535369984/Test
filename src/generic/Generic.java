package generic;

import javafx.beans.binding.NumberBinding;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description :
 * Created by WL on 2018/7/31
 */
public class Generic<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public static void showKeyValue1(Generic<Number> obj) {
        System.err.println("泛型测试,key value is " + obj.getKey());
    }

    /**
     * 如果在类中定义使用泛型的静态方法，需要添加额外的泛型声明（将这个方法定义成泛型方法）
     * 即使静态方法要使用泛型类中已经声明过的泛型也不可以。
     * 如：public static void show(T t){..},此时编译器会提示错误信息：
     * "StaticGenerator cannot be refrenced from static context"
     */
    public static <T> void show(T t) {

    }

    public static void printCollecton(Collection<?> collection) {
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
//        Generic<Integer> a = new Generic<Integer>(100);
//        Generic<Number> b = new Generic<Number>(200);
//        showKeyValue1(b);

        // 泛型数组
//        List<String>[] ls = new ArrayList<String>[10];
        List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Correct.
        Integer i = (Integer) lsa[1].get(0); // OK
        System.err.println(i);

        //=======================================================
        List<Integer>[] ls1 = new ArrayList[10];
        Object o1 = ls1;
        Object[] oa1 = (Object[]) o1;
        List<Integer> li1 = new ArrayList<Integer>();
        li1.add(new Integer(4));
        oa1[1] = li1; // Correct.
        Integer i1 = (Integer) ls1[1].get(0); // OK
        System.err.println(i1);

    }
}
