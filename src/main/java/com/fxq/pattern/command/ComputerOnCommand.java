package com.fxq.pattern.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 打开电脑的命令
 */
public class ComputerOnCommand implements Command {

    private final Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
