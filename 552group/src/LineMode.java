public class LineMode implements DrawMode{

    @Override
    public Shape createShape(int x, int y) {
        return new Line(x, y, 0, 0);
    }
}
