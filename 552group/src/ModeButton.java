import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author dkruger
 */
public class ModeButton extends JButton {
    private DrawMode mode;
    private DrawArea da;
    
    public ModeButton(String text, DrawMode mode, DrawArea da) {
        super(text);
        this.mode = mode;
        this.da = da;
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                da.setMode(mode);
            }
        });
    }
    
}
