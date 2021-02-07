package main.java.animation;
import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;



public class Circle extends DrawableObjectsComposite implements DrawableObject {

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(
                x.doubleValue(),
                y.doubleValue(),
                diameter,
                diameter
        );
        super.draw(gc);
    }

    @Override
    public DoubleProperty getXproperty() {
        return null;
    }

    @Override
    public DoubleProperty getYproperty() {
        return null;
    }

    public void setText(String s, int fontsize) {
        //TODO Implement
        //Hint: new Label(x, y, color, s, diameter / 2, -5, fontsize);

    }

    public void setDescription(String s, int fontsize) {
        //TODO Implement
        //Hint: new Label(x, y, color, s, -diameter / 2, diameter+10, fontsize);

    }
}
