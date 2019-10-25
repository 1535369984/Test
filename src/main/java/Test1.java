import com.sun.javaws.Main;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.List;

public class Test1 implements Serializable {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws Exception {
//        try {
//            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(f));
//            oo.writeObject(t);
//            oo.flush();
//            oo.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//            System.err.println(count(2));
//            System.err.println(Involution(7,3));

//        Charset charset = Charset.forName("UTF8");
//        ByteBuffer b = charset.encode("你好");
//        CharBuffer c = charset.decode(b);
        /** 反射 */
//        Class p = ArrayList.class;
//        Class[] interfaces = p.getInterfaces();
//        for (Class in :
//                interfaces) {
//            System.err.println(in.getName());
//        }
//
//        Field[] fields = p.getDeclaredFields();
//        for (Field f :
//                fields) {
//            System.err.println(f.getName() + ":" + f.getType().getName());
//        }
//
//        Method[] methods = p.getDeclaredMethods();
//        for (Method m : methods) {
//            System.err.print(m.getName() + "\t");
//            for (Class c : m.getParameterTypes()) {
//                System.err.print(c.getName() + "\t");
//            }
//            System.err.println();
//        }
        /** ====================== */
        List<Integer> originalUids = new ArrayList<Integer>();
        List<Integer> deleteUids = new ArrayList<Integer>();// 修改剔除的用户
        List<Integer> addUids = new ArrayList<Integer>();// 修改新增的用户
        Integer[] uids = new Integer[300000];
        for(int i = 0; i < 300000; i++){
            uids[i] = i;
        }
        for(int i = 240000; i < 340000; i++){
            originalUids.add(i);
        }
        findChangedUids(originalUids, uids, deleteUids, addUids);
    }
    private static void findChangedUids(List<Integer> originalUids, Integer[] newUids, List<Integer> deleteUids, List<Integer> addUids) {
        Long a = System.currentTimeMillis();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();// 把用户放进map
        if (originalUids != null ) {
            for (Integer originalUid : originalUids) {
                map.put(originalUid, 1);
            }
            for (Integer newUid : newUids) {
                if (map.containsKey(newUid)) {
                    // 重复的用户
                    map.put(newUid, (map.get(newUid) + 1));
                } else {
                    // 新增的用户
                    addUids.add(newUid);
                }
            }
            for (Integer integer : map.keySet()) {
                if (map.get(integer).equals(1)) {
                    // 表示该用户是需要删除的
                    deleteUids.add(integer);
                }
            }
        } else {
            // 原来没有人，全是新增的
            addUids = Arrays.asList(newUids);
        }
        System.err.println(System.currentTimeMillis() - a);
    }
    // 奇偶判定
    public static void oddEevenDecision() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数字:");
            int a = sc.nextInt();
            if (a != 0) {
                if ((a & 1) == 1) {
                    System.out.println("是奇数===");
                }
            } else {
                break;
            }
        }
    }

    // 三角数字
    public static int count(int a) {
        if (a == 1) {
            return 1;
        }
        return (a + count(a - 1));
    }

    // 乘方
    public static int Involution(int a, int Involution) {
        if (Involution == 1) {
            return a;
        }
        Involution--;
        return a * Involution(a, Involution);
    }

    // 开方
    public static int Square(int a, int Square) {
        return 0;
    }

}
