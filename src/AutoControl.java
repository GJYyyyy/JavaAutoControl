package src;

import java.util.TimerTask;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.util.Timer;

public class AutoControl implements NativeKeyListener {

    /**
     * 是否将脚本的启/停交与键盘来控制，如果设置为true，则通过键盘来控制启/停；如果设置为false，则在程序启动时自动运行脚本
     */
    static Boolean useKeyControl = true;

    static Timer timer = new Timer();

    public static void main(String[] args) {
        if (AutoControl.useKeyControl) {
            AutoControl.initKeyControl();
        } else {
            AutoControl.run();
        }
    }

    /**
     * 监听键盘按下键
     */
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_F10) {
            System.out.println("检测到F10键被按下，开始执行Robot脚本...");

            // >>> 在这里调用你已写好的Robot操作脚本 <<<

            AutoControl.run();

        }

        // 示例：监听ESC键用于退出程序
        if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            System.out.println("退出程序。");
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException ex) {
                ex.printStackTrace();
            }
            System.exit(0);
        }
    }

    /**
     * 监听键盘释放键
     */
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        // 如果不需要处理按键释放事件，可以留空
    }

    /**
     * 监听键盘键入字符
     */
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        // 如果不需要处理字符键入事件，可以留空
    }

    /**
     * 初始化键盘监听
     */
    public static void initKeyControl() {
        try {
            // 向全局屏幕注册本地钩子，这是启动监听的核心
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("注册全局钩子时出现问题: " + ex.getMessage());
            System.exit(1);
        }

        // 创建我们的监听器实例并将其添加到全局屏幕
        GlobalScreen.addNativeKeyListener(new AutoControl());

        // 添加一个关闭钩子，确保程序退出时能优雅地注销全局钩子[1](@ref)
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException ex) {
                // 忽略退出时的异常
            }
        }));

        System.out.println("全局键盘监听器已启动。按下F10键触发Robot脚本，按下ESC键退出。");
    }

    /**
     * 运行脚本
     */
    public static void run() {
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
                    if (++Script.COUNT >= Script.MAX_COUNT) {
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