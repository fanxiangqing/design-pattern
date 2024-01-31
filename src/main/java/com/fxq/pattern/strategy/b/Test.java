package com.fxq.pattern.strategy.b;

/**
 * Created by xiangqing'fan on 2024/01/29
 */
public class Test {

    public static void main(String[] args) {
        RoleA roleA = new RoleA("A");
        roleA.setAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setDisplayBehavior(new DisplayA())
                .setRunBehavior(new RunJCTQ());

        System.out.println(roleA.name + ": ");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();
    }
}
