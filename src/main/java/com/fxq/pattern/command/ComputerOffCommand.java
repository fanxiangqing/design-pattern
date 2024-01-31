package com.fxq.pattern.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 关闭电脑的命令
 */
public class ComputerOffCommand implements Command {

    private final Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
