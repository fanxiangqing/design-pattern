package com.fxq.observer.jdk;


public class Test {
    public static void main(String[] args) {
        ObjectFor3D objectFor3D = new ObjectFor3D();
        ObjectForSSQ objectForSSQ = new ObjectForSSQ();

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(objectFor3D);
        observer1.registerSubject(objectForSSQ);

        objectFor3D.setMsg("hello 3d'nums : 110");
        objectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }
}
