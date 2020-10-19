public class EllipseMode implements DrawMode{
    @Override
    public Shape createShape(int x, int y) {
        return new Ellipse(x, y, 0, 0);
    }
}
