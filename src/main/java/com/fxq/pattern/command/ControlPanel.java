package com.fxq.pattern.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 控制器面板，一共有9个按钮
 */
public class ControlPanel {
    /**
     * 按钮数量
     */
    private static final int CONTROL_SIZE = 9;

    private final Command[] commands;

    public ControlPanel() {
        commands = new Command[CONTROL_SIZE];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = new NoCommand();
        }
    }

    /**
     * 设置每个按钮对应的命令
     *
     * @param index   按键位置
     * @param command 命令
     */
    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    /**
     * 模拟点击按键
     *
     * @param index 按键位置
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }
}
