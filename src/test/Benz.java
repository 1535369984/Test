package test;

/**
 * @Description :
 * Created by WL on 2018/1/31
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.err.println("奔驰开始跑了。。。");
    }

    public void otherSkill() {
        System.err.println("可以装逼了");
    }

    public static void main(String[] args) {
        ICar i = new BenzC200();
        i.run();
    }
}

class BenzC200 extends Benz {
    @Override
    public void run() {
        System.err.println("BenzC200跑了...");
    }
}
