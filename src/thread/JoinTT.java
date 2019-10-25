package thread;

/**
 * @Description :
 * Created by WL on 2018/12/14
 */
public class JoinTT {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB(a);
        a.start();
        b.start();
        System.err.println("主线程结束");
    }
}

class ThreadA extends Thread {
    public ThreadA() {
        super("ThreadA");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("A开始了");
    }
}

class ThreadB extends Thread {
    ThreadA a;

    public ThreadB(ThreadA threadA) {
        super("ThreadB");
        this.a = threadA;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String threadName = Thread.currentThread().getName();
        System.err.println(threadName + " start.");
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("线程B结束了");
    }
}
