package com.fxq.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 打开电灯的命令
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
