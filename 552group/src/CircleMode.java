
/**
 *
 * @author dkruger
 */
public class CircleMode implements DrawMode {

    @Override
    public Shape createShape(int x, int y) {
        return new Circle(x,y, 0);
    }
    
}
