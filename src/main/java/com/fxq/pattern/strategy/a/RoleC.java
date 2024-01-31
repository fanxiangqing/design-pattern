package com.fxq.pattern.strategy.a;

/**
 * Created by xiangqing'fan on 2024/01/29
 * 角色 C
 */
public class RoleC extends Role {

    public RoleC(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("样子1"); // 从 RoleA 中拷贝
    }

    @Override
    protected void run() {
        System.out.println("烟雾弹");
    }

    @Override
    protected void attack() {
        System.out.println("九阳神功");
    }

    @Override
    protected void defend() {
        System.out.println("铁布衫"); // 从 RoleB 中拷贝
    }
}
