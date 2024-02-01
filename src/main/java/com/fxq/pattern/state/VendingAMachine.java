package com.fxq.pattern.state;

/**
 * Created by xiangqing'fan on 2024/02/01
 * 自动售货机
 */
public class VendingAMachine {

    /**
     * 已投币
     */
    private final static int HAS_MONEY = 0;

    /**
     * 未投币
     */
    private final static int NO_MONEY = 1;

    /**
     * 售出商品
     */
    private final static int SOLD = 2;

    /**
     * 商品售尽
     */
    private final static int SOLD_OUT = 3;

    private int currentState = NO_MONEY;

    private int count = 0;

    public VendingAMachine(int count) {
        this.count = count;
        if (count == 0) {
            currentState = SOLD_OUT;
        }
    }

    /**
     * 投入硬币，任何状态用户都可能投币
     */
    public void insertMoney() {
        switch (currentState) {
            case NO_MONEY:
                currentState = HAS_MONEY;
                System.out.println("成功投入硬币");
                break;
            case HAS_MONEY:
                System.out.println("已有硬币，无需投币");
                break;
            case SOLD:
                System.out.println("请稍等...");
                break;
            case SOLD_OUT:
                System.out.println("商品已售尽，请勿投币");
                break;
            default:
                throw new RuntimeException("没有此状态");
        }
    }

    /**
     * 退币，任何状态用户都可能退币
     */
    public void backMoney() {
        switch (currentState) {
            case NO_MONEY:
                System.out.println("您还未投币");
                break;
            case HAS_MONEY:
                currentState = NO_MONEY;
                System.out.println("退币成功");
                break;
            case SOLD:
                System.out.println("您已购买了商品");
                break;
            case SOLD_OUT:
                System.out.println("您未投币...");
                break;
            default:
                throw new RuntimeException("没有此状态");
        }
    }

    /**
     * 转动手柄，任何状态用户都可能转动手柄
     */
    public void turnCrank() {
        switch (currentState) {
            case NO_MONEY:
                System.out.println("请先投入硬币...");
                break;
            case HAS_MONEY:
                System.out.println("正在出商品...");
                currentState = SOLD;
                dispense();
                break;
            case SOLD:
                System.out.println("连续转动也没用...");
                break;
            case SOLD_OUT:
                System.out.println("商品已经售尽");
                break;
            default:
                throw new RuntimeException("没有此状态");
        }
    }

    /**
     * 发放商品
     */
    private void dispense() {
        switch (currentState) {
            case NO_MONEY:
            case HAS_MONEY:
            case SOLD_OUT:
                throw new RuntimeException("非法状态....");
            case SOLD:
                count--;
                System.out.println("发出商品");
                if (count > 0) {
                    currentState = NO_MONEY;
                } else {
                    System.out.println("商品已售尽");
                    currentState = SOLD_OUT;
                }
                break;
            default:
                throw new RuntimeException("没有此状态");
        }
    }
}
