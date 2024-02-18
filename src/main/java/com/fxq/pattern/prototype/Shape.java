package com.fxq.pattern.prototype;

/**
 * Created by xiangqing'fan on 2024/02/18
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Shape clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
