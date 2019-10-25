package test;

import java.util.HashMap;
import java.util.Map;

public class Son extends Father {
    public static final Son aa = new Son();

    static {
        System.out.println("son static");
    }

    {
        System.out.println("son normal code");
    }

    public Son() {
        System.out.println("son1");
    }


    public Son(String name) {
    }

    @Override
    public void fatest() {
        System.out.println("sontest");
    }

    @Override
    public HashMap test(Map map) {
        return (HashMap) map;
    }

    public void say() {
        System.out.println("son");
    }

    public static void main(String[] args) {
//        Son s = new Son();
//        System.out.println("================================");
//        Son s1 = new Son();
//        System.out.println(s.aa.hashCode() + ":" + s1.aa.hashCode() + ":" + Son.aa.hashCode());
//        System.out.println(s.aa == s1.aa);
//        System.out.println(Son.aa == s1.aa);
        System.out.println(Son.class);
//        System.out.println("================================");
//        System.out.println(Son.class);

//        s.fatest();
    }

}
