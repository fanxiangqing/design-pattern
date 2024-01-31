package com.fxq.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 关闭电灯的命令
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
