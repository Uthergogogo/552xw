import java.awt.*;

public class PolyLine extends Shape{
    private int dx;
    private int dy;

    public PolyLine(int x, int y, int dx, int dy) {
        super(x, y);
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public void setSecondPoint(int x, int y) {
        dx = x;
        dy = y;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(x, y, dx, dy);
    }
}
