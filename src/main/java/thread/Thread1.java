package thread;

/**
 * @Description :
 * Created by WL on 2018/1/4
 */
public class Thread1 extends Thread {
    private String threadName;

    public Thread1(String threadName, Num num) {
        this.threadName = threadName;
        this.num = num;
    }

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }

    private Num num;

    public Thread1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num.aa > 0) {
                    System.err.println(this.threadName + ":" + num.aa);
                    num.aa--;
                } else {
                    return;
                }
            }
        }
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) {
        Num num = new Num(500);
        Thread1 a = new Thread1("A", num);
        Thread1 b = new Thread1("B", num);
        Thread1 c = new Thread1("C", num);
        Thread1 d = new Thread1("D", num);
        a.start();
        b.start();
        c.start();
        d.start();
        try {
            a.join();
//            b.join();
//            c.join();
//            d.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("ok");
    }

}

class Num {
    int aa;

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    Num(int aa) {
        this.aa = aa;
    }
}