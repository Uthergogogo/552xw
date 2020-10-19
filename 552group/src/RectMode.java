
/**
 *
 * @author dkruger
 */
public class RectMode implements DrawMode {

    @Override
    public Shape createShape(int x, int y) {
        return new Rect(x,y, 0,0);
    }
    
}
