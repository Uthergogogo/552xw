import javafx.scene.shape.Polyline;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class DrawApp extends JFrame {
    private final static DrawMode lineMode = new LineMode(); //new RectMode();
    private final static DrawMode rectMode = new RectMode();
    private final static DrawMode circleMode = new CircleMode();
    private final static DrawMode ellipseMode = new EllipseMode(); //new EllipseMode();
    private final static DrawMode polyLineMode = new PolyLineMode();

    public static DrawMode getDefaultMode() { return rectMode; }

    private void buildMenus() {

    }
    private void buildLayout() {
        setTitle("DrawApp");
        setSize(1000,1000);
        JPanel p = new JPanel();
//        p.setBackground(Color.RED);
        p.setLayout(new GridLayout(1, 10));
        Container c = getContentPane();
        DrawArea da = new DrawArea();
        c.add(da, BorderLayout.CENTER);

        JButton[] buttons = {
            new ModeButton("Line", lineMode, da),
            new ModeButton("Circle", circleMode, da),
            new ModeButton("Rect", rectMode, da),
            new ModeButton("Ellipse", ellipseMode, da), new ModeButton("PolyLine", polyLineMode, da)
        };
        for (JButton b : buttons) {
            p.add(b);
        }
        
        c.add(p, BorderLayout.NORTH);
    }
    public DrawApp() {
        super();
        buildMenus();
        buildLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new DrawApp();
    }
    
}
