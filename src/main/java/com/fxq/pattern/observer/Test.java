package com.fxq.pattern.observer;

public class Test {
    public static void main(String[] args) {
        // 模拟一个 3D 服务号
        ObjectFor3D subjectFor3D = new ObjectFor3D();

        // 客户1
        Observer1 observer1 = new Observer1(subjectFor3D);
        // 客户2
        Observer2 observer2 = new Observer2(subjectFor3D);

        subjectFor3D.setMsg("20140420的3D号码是：127");
    }
}
