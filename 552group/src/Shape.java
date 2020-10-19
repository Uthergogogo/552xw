
import java.awt.*;
/**
 *
 * @author dkruger
 */
public abstract class Shape {
    int x,y;
    public Shape(int x, int y) { this.x = x; this.y = y; }
    public abstract void setSecondPoint(int x, int y);
    public abstract void draw(Graphics g);
}
