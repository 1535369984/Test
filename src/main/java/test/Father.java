package test;

import java.util.HashMap;
import java.util.Map;

public class Father {
    public static final Father aa = new Father();

    static {
        System.out.println("father static");
    }

    {
        System.out.println("father normal code");
    }

    public Father() {
        System.out.println("fa");
    }

    public Father(String name) {
        System.out.println("我是2");
    }

    public HashMap test(Map map) {
        System.out.println("ft");
        return (HashMap) map;
    }

    public void fatest() {
        System.out.println("fatest");
    }
}
