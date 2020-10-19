public class PolyLineMode implements DrawMode{
    @Override
    public Shape createShape(int x, int y) {
        return new PolyLine(x, y, 0, 0);
    }
}
