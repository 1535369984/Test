package thread;

public class Test2 {
    public static void main(String[] args) {
        TicketBox box = new TicketBox();
        Window1 w1 = new Window1(box);
        Window1 w2 = new Window1(box);
        Window1 w3 = new Window1(box);
        Window1 w4 = new Window1(box);
        w1.windowName = "A";
        w2.windowName = "B";
        w3.windowName = "C";
        w4.windowName = "D";
        //∆Ù∂Ø
        w1.start();
        w2.start();
        w3.start();
        w4.start();
    }
}

class TicketBox {
    public int total = 100;

    //»°∆±
    public void pick() {
        total--;
        System.out.println("rest:" + total);
    }
}

//¥∞ø⁄1
class Window1 extends Thread {
    public TicketBox box;
    public String windowName;

    public Window1(TicketBox box) {//“¿¿µ◊¢»Î
        this.box = box;
    }

    // €∆±
    public void run() {
        for (int i = 0; i < 100; i++) {
            //À¯◊°∆±œ‰
            synchronized (box) {
                if (box.total > 0) {
                    System.out.println(windowName + "1:");
                    //—”≥ŸThread.sleep(5)
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    }
                    box.pick();
                }
            }

        }
    }
}

class Window2 extends Thread {
    public TicketBox box;

    public Window2(TicketBox box) {//“¿¿µ◊¢»Î
        this.box = box;
    }

    // €∆±
    public void run() {
        for (int i = 0; i < 100; i++) {
            //À¯◊°∆±œ‰
            synchronized (box) {
                if (box.total > 0) {
                    System.out.println("2:");
                    //—”≥ŸThread.sleep(5)
                    try {
                        Thread.sleep(3);
                    } catch (Exception e) {
                    }
                    box.pick();
                }
            }

        }
    }
}

