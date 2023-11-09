package src;

import java.util.TimerTask;
import java.util.Timer;

public class AutoControl {

    static Timer timer = new Timer();

    public static void main(String[] args) {
        // 执行循环前置脚本
        try {
            Script.beforeRun();
        } catch (InterruptedException err) {
            err.printStackTrace();
        }

        /**
         * 执行循环脚本
         */
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {
                    Script.run();
                    if (Script.COUNT++ >= Script.MAX_COUNT) {
                        Script.COUNT = 0;
                        timer.cancel();
                    }
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, Script.INTERVAL); // 从现在开始，每隔1秒执行一次task

        // 执行循环后置脚本
        try {
            Script.afterRun();
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }
}