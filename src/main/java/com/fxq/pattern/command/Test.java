package com.fxq.pattern.command;

/**
 * Created by xiangqing'fan on 2024/01/30
 */
public class Test {
    public static void main(String[] args) {

        // 三个家电
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();

        // 控制器
        ControlPanel control = new ControlPanel();

        // 设置按钮功能
        control.setCommand(0, new ComputerOnCommand(computer));
        control.setCommand(1, new ComputerOffCommand(computer));
        control.setCommand(2, new DoorOpenCommand(door));
        control.setCommand(3, new DoorCloseCommand(door));
        control.setCommand(4, new LightOnCommand(light));
        control.setCommand(5, new LightOffCommand(light));

        // 模拟点击
        control.keyPressed(0);
        control.keyPressed(1);
        control.keyPressed(2);
        control.keyPressed(3);
        control.keyPressed(4);
        control.keyPressed(5);
        control.keyPressed(8);

        System.out.println("=================================");
        System.out.println("==========一键关闭所有设备=========");
        QuickCommand quickCommand = new QuickCommand(
                new Command[]{
                        new DoorCloseCommand(door),
                        new ComputerOffCommand(computer),
                        new LightOffCommand(light)
                });
        control.setCommand(6, quickCommand);

        control.keyPressed(6);
    }
}
