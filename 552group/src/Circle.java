import java.awt.*;
/**
 * @author dkruger
 */
public class Circle extends Shape {
    private int r;
    
    public Circle(int x, int y, int r) {
        super(x,y);
        this.r = r;
    }
      @Override
    public void setSecondPoint(int x, int y) {
        int dx = x - this.x, dy = y - this.y;
        r = (int)Math.sqrt(dx*dx+dy*dy);
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, 2*r, 2*r);
    }  
}
