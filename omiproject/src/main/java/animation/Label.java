package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Label implements DrawableObject {

    private DoubleProperty x;
    private DoubleProperty y;

    private int fontsize = -1;

    @Override
    public void draw(GraphicsContext gc) {
        if (fontsize != -1)
            gc.setFont(new Font(fontsize));
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setFill(color);
        gc.fillText(text, x.doubleValue() + offsetX, y.doubleValue() + offsetY);
    }
}
