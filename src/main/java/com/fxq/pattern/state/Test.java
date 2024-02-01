package com.fxq.pattern.state;

/**
 * Created by xiangqing'fan on 2024/02/01
 */
public class Test {
    public static void main(String[] args) {
        VendingAMachine machine = new VendingAMachine(10);
        machine.insertMoney();
        machine.turnCrank();

        System.out.println("=================");
        machine.insertMoney();
        machine.turnCrank();

        System.out.println("=================");
        machine.insertMoney();
        machine.backMoney();
        machine.backMoney();
        machine.turnCrank();
    }
}
