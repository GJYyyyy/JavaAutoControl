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

    final static int MOUSE_LEFT_BUTTON = KeyEvent.BUTTON1_DOWN_MASK;
    final static int MOUSE_RIGHT_BUTTON = KeyEvent.BUTTON2_DOWN_MASK;

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
