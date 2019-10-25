import javax.swing.*;
import java.awt.*;

/**
 * @Description :
 * Created by WL on 2018/1/4
 */
public class SwingLearn1 extends JFrame {

    public void createJfram(String title) {
        JFrame jf = new JFrame(title);
        Container c = jf.getContentPane();
        JLabel jl = new JLabel("这是一个Jframe窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        c.add(jl);
        c.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200, 200);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new SwingLearn1().createJfram("创建一个Jframe窗体");
    }
}
