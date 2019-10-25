package SeniorEventTest;

import java.awt.event.KeyEvent;
import java.util.EventListener;

/**
 * @Description : java键盘事件监听
 * Created by WL on 2018/1/4
 */
public interface KeyListener extends EventListener {

    public void KeyTyped(KeyEvent e);

    public void KeyPressed(KeyEvent e);

    public void KeyReleased(KeyEvent e);

}
