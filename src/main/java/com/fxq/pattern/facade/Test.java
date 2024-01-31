package com.fxq.pattern.facade;

/**
 * Created by xiangqing'fan on 2024/01/31
 */
public class Test {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade(
                new Computer(),
                new Player(),
                new Light(),
                new Projector(),
                new PopcornPopper());

        System.out.println("====开始看电影====");
        facade.watchMovie();

        System.out.println("==============");

        System.out.println("====不看了====");
        facade.stopMovie();
    }
}
