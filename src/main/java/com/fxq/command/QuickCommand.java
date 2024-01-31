package com.fxq.command;

/**
 * Created by xiangqing'fan on 2024/01/31
 * 定义一个命令，可以干一系列事情
 */
public class QuickCommand implements Command {

    private final Command[] commands;

    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
