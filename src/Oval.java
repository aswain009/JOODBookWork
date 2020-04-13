import javax.swing.*;
import java.awt.*;

class Oval {

    protected int x, y, width, height;

    public Oval(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    protected void setX(int x) {
        this.x = x;
    }
    protected void setY(int y) {
        this.y = y;
    }
    protected void setWidth(int w) {
        this.width = w;
    }
    protected void setHeight(int h) {
        this.height = h;
    }

    protected void draw(Graphics g) {

        g.drawOval(this.x, this.y, this.width, this.height);
    }

    protected int getWidth() {
        return this.width;
    }

    protected int getHeight() {
        return this.height;
    }
    protected int getX() {
        return this.x;
    }
    protected int getY() {
        return this.y;
    }

    }


