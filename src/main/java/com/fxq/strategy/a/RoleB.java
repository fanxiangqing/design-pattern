package com.fxq.strategy.a;

/**
 * Created by xiangqing'fan on 2024/01/29
 * 角色 B
 */

public class RoleB extends Role {

    public RoleB(String name) {
        this.name = name;
    }
    @Override
    protected void display() {
        System.out.println("样子2");
    }


    @Override
    protected void run() {
        System.out.println("金蝉脱壳"); // 从 RoleA 中拷贝
    }

    @Override
    protected void attack() {
        System.out.println("祥龙十八掌"); // 从 RoleA 中拷贝
    }

    @Override
    protected void defend() {
        System.out.println("铁布衫");
    }
}
