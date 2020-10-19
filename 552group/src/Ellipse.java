import java.awt.*;

public class Ellipse extends Shape{
    private int r1;
    private int r2;

    public Ellipse(int x, int y, int r1, int r2) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void setSecondPoint(int x, int y) {
        int dx = x - this.x, dy = y - this.y;
        r1 = (int)Math.sqrt(x*x+y*y);
        r2 = (int)Math.sqrt(dx*dx+dy*dy);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, r1, r2);
    }
}
