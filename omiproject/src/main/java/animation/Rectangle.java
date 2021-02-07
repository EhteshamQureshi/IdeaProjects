package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;


public class Rectangle implements DrawableObject {

    private DoubleProperty x;
    private DoubleProperty y;

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(0, 0, width, hight);
    }

    @Override
    public DoubleProperty getXproperty() {
        return this.x;
    }

    @Override
    public DoubleProperty getYproperty() {
        return this.y;
    }
}
