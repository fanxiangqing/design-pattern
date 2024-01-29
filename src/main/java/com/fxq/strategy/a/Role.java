package com.fxq.strategy.a;

/**
 * Created by xiangqing'fan on 2024/01/29
 * 游戏的角色超类
 */
public abstract class Role {

    protected String name;

    protected abstract void display();

    protected abstract void run();

    protected abstract void attack();

    protected abstract void defend();
}
