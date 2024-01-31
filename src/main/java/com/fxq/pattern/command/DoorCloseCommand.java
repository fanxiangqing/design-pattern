package com.fxq.pattern.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 * 关闭门的命令
 */
public class DoorCloseCommand implements Command {

    private final Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
