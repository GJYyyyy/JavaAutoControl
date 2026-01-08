package src;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * 鼠标键盘操作分装
 */
public class Utils {
    Robot robot;

    // 鼠标按键
    final static int MOUSE_LEFT_BUTTON = KeyEvent.BUTTON1_DOWN_MASK; // 左键
    final static int MOUSE_RIGHT_BUTTON = KeyEvent.BUTTON2_DOWN_MASK; // 右键
    final static int MOUSE_MIDDLE_BUTTON = KeyEvent.BUTTON3_DOWN_MASK; // 中键

    final static int KEY_0 = KeyEvent.VK_0;
    final static int KEY_1 = KeyEvent.VK_1;
    final static int KEY_2 = KeyEvent.VK_2;
    final static int KEY_3 = KeyEvent.VK_3;
    final static int KEY_4 = KeyEvent.VK_4;
    final static int KEY_5 = KeyEvent.VK_5;
    final static int KEY_6 = KeyEvent.VK_6;
    final static int KEY_7 = KeyEvent.VK_7;
    final static int KEY_8 = KeyEvent.VK_8;
    final static int KEY_9 = KeyEvent.VK_9;
    final static int KEY_A = KeyEvent.VK_A;
    final static int KEY_B = KeyEvent.VK_B;
    final static int KEY_C = KeyEvent.VK_C;
    final static int KEY_D = KeyEvent.VK_D;
    final static int KEY_E = KeyEvent.VK_E;
    final static int KEY_F = KeyEvent.VK_F;
    final static int KEY_G = KeyEvent.VK_G;
    final static int KEY_H = KeyEvent.VK_H;
    final static int KEY_I = KeyEvent.VK_I;
    final static int KEY_J = KeyEvent.VK_J;
    final static int KEY_K = KeyEvent.VK_K;
    final static int KEY_L = KeyEvent.VK_L;
    final static int KEY_M = KeyEvent.VK_M;
    final static int KEY_N = KeyEvent.VK_N;
    final static int KEY_O = KeyEvent.VK_O;
    final static int KEY_P = KeyEvent.VK_P;
    final static int KEY_Q = KeyEvent.VK_Q;
    final static int KEY_R = KeyEvent.VK_R;
    final static int KEY_S = KeyEvent.VK_S;
    final static int KEY_T = KeyEvent.VK_T;
    final static int KEY_U = KeyEvent.VK_U;
    final static int KEY_V = KeyEvent.VK_V;
    final static int KEY_W = KeyEvent.VK_W;
    final static int KEY_X = KeyEvent.VK_X;
    final static int KEY_Y = KeyEvent.VK_Y;
    final static int KEY_Z = KeyEvent.VK_Z;

    // 小数字键盘
    final static int KEY_0_NUM = KeyEvent.VK_NUMPAD0;
    final static int KEY_1_NUM = KeyEvent.VK_NUMPAD1;
    final static int KEY_2_NUM = KeyEvent.VK_NUMPAD2;
    final static int KEY_3_NUM = KeyEvent.VK_NUMPAD3;
    final static int KEY_4_NUM = KeyEvent.VK_NUMPAD4;
    final static int KEY_5_NUM = KeyEvent.VK_NUMPAD5;
    final static int KEY_6_NUM = KeyEvent.VK_NUMPAD6;
    final static int KEY_7_NUM = KeyEvent.VK_NUMPAD7;
    final static int KEY_8_NUM = KeyEvent.VK_NUMPAD8;
    final static int KEY_9_NUM = KeyEvent.VK_NUMPAD9;

    // 特殊按键
    final static int KEY_CTRL = KeyEvent.VK_CONTROL; // ctrl键
    final static int KEY_ALT = KeyEvent.VK_ALT; // alt键
    final static int KEY_SHIFT = KeyEvent.VK_SHIFT; // shift键
    final static int KEY_ENTER = KeyEvent.VK_ENTER; // 回车键

    // F1 ~ F12
    final static int KEY_F1 = KeyEvent.VK_F1;
    final static int KEY_F2 = KeyEvent.VK_F2;
    final static int KEY_F3 = KeyEvent.VK_F3;
    final static int KEY_F4 = KeyEvent.VK_F4;
    final static int KEY_F5 = KeyEvent.VK_F5;
    final static int KEY_F6 = KeyEvent.VK_F6;
    final static int KEY_F7 = KeyEvent.VK_F7;
    final static int KEY_F8 = KeyEvent.VK_F8;
    final static int KEY_F9 = KeyEvent.VK_F9;
    final static int KEY_F10 = KeyEvent.VK_F10;
    final static int KEY_F11 = KeyEvent.VK_F11;
    final static int KEY_F12 = KeyEvent.VK_F12;

    public Utils() {
        try {
            // 创建Robot对象
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    /**
     * 移动鼠标到指定位置
     * 
     * @param x
     * @param y
     */
    public void mouseMove(int x, int y) {
        robot.mouseMove(x, y);
    }

    /**
     * 移动鼠标到指定位置(延迟一段时间执行)
     * 
     * @param x
     * @param y
     * @param delay
     * @throws InterruptedException
     */
    public void mouseMove(int x, int y, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.mouseMove(x, y);
    }

    /**
     * 移动鼠标到指定位置(范围时间内随机延迟)
     * 
     * @param x
     * @param y
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void mouseMove(int x, int y, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.mouseMove(x, y);
    }

    /**
     * 点击鼠标键
     * 
     * @param buttons
     */
    public void mouseClick(int buttons) {
        robot.mousePress(buttons);
        robot.mouseRelease(buttons);
    }

    /**
     * 点击鼠标键(延迟一段时间执行)
     * 
     * @param buttons
     * @param delay
     * @throws InterruptedException
     */
    public void mouseClick(int buttons, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.mousePress(buttons);
        robot.mouseRelease(buttons);
    }

    /**
     * 点击鼠标键(范围时间内随机延迟)
     * 
     * @param buttons
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void mouseClick(int buttons, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.mousePress(buttons);
        robot.mouseRelease(buttons);
    }

    /**
     * 按住鼠标键
     * 
     * @param buttons
     */
    public void mousePress(int buttons) {
        robot.mousePress(buttons);
    }

    /**
     * 按住鼠标键(延迟一段时间执行)
     * 
     * @param buttons
     * @param delay
     * @throws InterruptedException
     */
    public void mousePress(int buttons, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.mousePress(buttons);
    }

    /**
     * 按住鼠标键(范围时间内随机延迟)
     * 
     * @param buttons
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void mousePress(int buttons, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.mousePress(buttons);
    }

    /**
     * 松开鼠标键
     * 
     * @param buttons
     */
    public void mouseRelease(int buttons) {
        robot.mouseRelease(buttons);
    }

    /**
     * 松开鼠标键(延迟一段时间执行)
     * 
     * @param buttons
     * @param delay
     * @throws InterruptedException
     */
    public void mouseRelease(int buttons, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.mouseRelease(buttons);
    }

    /**
     * 松开鼠标键(范围时间内随机延迟)
     * 
     * @param buttons
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void mouseRelease(int buttons, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.mouseRelease(buttons);
    }

    /**
     * 滚动鼠标
     * 
     * @param wheelAmt
     */
    public void mouseWheel(int wheelAmt) {
        robot.mouseWheel(wheelAmt);
    }

    /**
     * 滚动鼠标(延迟一段时间执行)
     * 
     * @param wheelAmt
     * @param delay
     * @throws InterruptedException
     */
    public void mouseWheel(int wheelAmt, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.mouseWheel(wheelAmt);
    }

    /**
     * 滚动鼠标(范围时间内随机延迟)
     * 
     * @param wheelAmt
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void mouseWheel(int wheelAmt, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.mouseWheel(wheelAmt);
    }

    /**
     * 点击键盘键
     * 
     * @param keyCode
     */
    public void keyClick(int keyCode) {
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }

    /**
     * 点击键盘键(延迟一段时间执行)
     * 
     * @param keyCode
     * @param delay
     * @throws InterruptedException
     */
    public void keyClick(int keyCode, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }

    /**
     * 点击键盘键(范围时间内随机延迟)
     * 
     * @param keyCode
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void keyClick(int keyCode, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }

    /**
     * 按住键盘键
     * 
     * @param keyCode
     */
    public void keyPress(int keyCode) {
        robot.keyPress(keyCode);
    }

    /**
     * 按住键盘键(延迟一段时间执行)
     * 
     * @param keyCode
     * @param delay
     * @throws InterruptedException
     */
    public void keyPress(int keyCode, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.keyPress(keyCode);
    }

    /**
     * 按住键盘键(范围时间内随机延迟)
     * 
     * @param keyCode
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void keyPress(int keyCode, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.keyPress(keyCode);
    }

    /**
     * 松开键盘键
     * 
     * @param keyCode
     */
    public void keyRelease(int keyCode) {
        robot.keyRelease(keyCode);
    }

    /**
     * 松开键盘键(延迟一段时间执行)
     * 
     * @param keyCode
     * @param delay
     * @throws InterruptedException
     */
    public void keyRelease(int keyCode, int delay) throws InterruptedException {
        Thread.sleep(delay);
        robot.keyRelease(keyCode);
    }

    /**
     * 松开键盘键(范围时间内随机延迟)
     * 
     * @param keyCode
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void keyRelease(int keyCode, int minDelay, int maxDelay) throws InterruptedException {
        Thread.sleep(random(minDelay, maxDelay));
        robot.keyRelease(keyCode);
    }

    /**
     * 点击键盘组合键
     * 
     * @param keyCodes
     */
    public void keyComboClick(int[] keyCodes) {
        for (int i = 0; i < keyCodes.length; i++) {
            robot.keyPress(keyCodes[i]);
        }
        for (int i = keyCodes.length - 1; i >= 0; i--) {
            robot.keyRelease(keyCodes[i]);
        }
    }

    /**
     * 点击键盘组合键(延迟一段时间执行)
     * 
     * @param keyCodes
     * @param delay
     * @throws InterruptedException
     */
    public void keyComboClick(int[] keyCodes, int delay) throws InterruptedException {
        for (int i = 0; i < keyCodes.length; i++) {
            robot.keyPress(keyCodes[i]);
        }
        Thread.sleep(delay);
        for (int i = keyCodes.length - 1; i >= 0; i--) {
            robot.keyRelease(keyCodes[i]);
        }
    }

    /**
     * 点击键盘组合键(范围时间内随机延迟)
     * 
     * @param keyCodes
     * @param minDelay
     * @param maxDelay
     * @throws InterruptedException
     */
    public void keyComboClick(int[] keyCodes, int minDelay, int maxDelay) throws InterruptedException {
        for (int i = 0; i < keyCodes.length; i++) {
            robot.keyPress(keyCodes[i]);
        }
        Thread.sleep(random(minDelay, maxDelay));
        for (int i = keyCodes.length - 1; i >= 0; i--) {
            robot.keyRelease(keyCodes[i]);
        }
    }

    /**
     * 获取鼠标位置
     * 
     * @return
     */
    public String getMousePoint() throws InterruptedException {
        Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
        return "x: " + mouseLocation.getX() + ", y: " + mouseLocation.getY();
    }

    private int random(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
