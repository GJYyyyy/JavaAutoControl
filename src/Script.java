package src;

public class Script {
    /**
     * 当前循环次数
     */
    static int COUNT = 0;

    /**
     * 最大循环次数
     */
    static int MAX_COUNT = 50;

    /**
     * 循环时间间隔
     */
    static int INTERVAL = 1000;

    static Utils utils = new Utils();

    /**
     * 脚本前置操作
     */
    static void beforeRun() throws InterruptedException {
        /**
         * 请在这里编写脚本前置操作
         * utils.mouseMove(100, 100, 1000, 2000);
         * utils.mouseClick(Utils.MOUSE_LEFT_BUTTON, 1000, 2000);
         * utils.keyClick(Utils.KEY_9, 1000, 2000);
         * int[] keyCodes = { Utils.KEY_CTRL, Utils.KEY_C }; // Ctrl + C 复制操作
         * utils.keyComboClick(keyCodes); // Ctrl + C 复制操作
         */
    }

    /**
     * 脚本循环操作
     * 
     * @throws InterruptedException
     */
    static void run() throws InterruptedException {
        /**
         * 请在这里编写脚本循环操作
         * utils.mouseMove(100, 100, 1000, 2000);
         * utils.mouseClick(Utils.MOUSE_LEFT_BUTTON, 1000, 2000);
         * utils.keyClick(Utils.KEY_9, 1000, 2000);
         * int[] keyCodes = { Utils.KEY_CTRL, Utils.KEY_C }; // Ctrl + C 复制操作
         * utils.keyComboClick(keyCodes); // Ctrl + C 复制操作
         */
    }

    /**
     * 脚本后置操作
     */
    static void afterRun() throws InterruptedException {
        /**
         * 请在这里编写脚本后置操作
         * utils.mouseMove(100, 100, 1000, 2000);
         * utils.mouseClick(Utils.MOUSE_LEFT_BUTTON, 1000, 2000);
         * utils.keyClick(Utils.KEY_9, 1000, 2000);
         * int[] keyCodes = { Utils.KEY_CTRL, Utils.KEY_C }; // Ctrl + C 复制操作
         * utils.keyComboClick(keyCodes); // Ctrl + C 复制操作
         */
    }
}
