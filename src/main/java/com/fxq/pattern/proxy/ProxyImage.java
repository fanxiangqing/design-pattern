package com.fxq.pattern.proxy;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(this.filename);
        }
        realImage.display();
    }
}
