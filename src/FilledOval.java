import java.awt.*;

public class FilledOval extends Oval{

    public FilledOval(int x, int y, int w, int h ){
       super( x,  y,  w,  h);
       this.setX(x);
       this.setY(y);
       this.setHeight(h);
       this.setWidth(w);
    }
     public void draw(Graphics g){
        g.fillOval(x, y, width, height);
    }

}