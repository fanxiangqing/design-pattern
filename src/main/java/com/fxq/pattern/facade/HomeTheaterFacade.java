package com.fxq.pattern.facade;

/**
 * Created by xiangqing'fan on 2024/01/31
 */
public class HomeTheaterFacade {

    private final Computer computer;
    private final Player player;
    private final Light light;
    private final Projector projector;
    private final PopcornPopper popper;

    public HomeTheaterFacade(Computer computer, Player player, Light light, Projector projector, PopcornPopper popper) {
        this.computer = computer;
        this.player = player;
        this.light = light;
        this.projector = projector;
        this.popper = popper;
    }

    public void watchMovie() {
        /*
          1. 打开爆米花机
          2. 制作爆米花
          3. 将灯光调暗
          4. 打开投影仪
          5. 放下投影仪投影区
          6. 打开电脑
          7. 打开播放器
          8. 将播放器音调设为环绕立体声
         */
        popper.on();
        popper.makePopcorn();
        light.down();
        projector.on();
        projector.open();
        computer.on();
        player.on();
        player.make3DListener();
    }

    public void stopMovie() {
        popper.stopMakePopcorn();
        popper.off();
        light.up();
        projector.off();
        projector.close();
        computer.off();
        player.off();
    }
}
