package com.fxq.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 打开门的命令
 */
public class DoorOpenCommand implements Command {

    private final Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
